pipeline {
    agent {
        label 'mavenjdk11-openshift-slave'
    }
    tools {
        maven 'Maven_3.6.2'
    }
    environment {
        mavenVersion = '1.0'
        binary_type = 'war'
        deploy_version = ''
        application_properties = './tempDeploy/WEB-INF/classes/application.properties'
        application_template = 'src/main/resources/application.properties.template'
        properties_yaml = "${env.WORKSPACE}/deploy.properties.yaml"
    }
    stages {
        stage('Prepare Environment') {
            steps {
                echo 'Prepare Environment stage...'
            }
        }

        stage('Checkout Code') {
            steps {
                echo 'Checkout Code stage...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Build stage...'
                script {
                    sh 'mvn --v'
                    sh 'mvn install -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Test stage...'
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Sonar') {
            steps {
                echo 'Sonar stage...'
                script {
                    try {
                        sh 'mvn verify sonar:sonar'
                    } catch(err) {
                        echo 'Sonar scan failed...'
                    }
                }
            }
        }

        stage('Nexus Upload'){
            steps {
                echo 'Nexus Upload stage...'
                script {
                    if (env.BRANCH_NAME == 'development') {
                        deploy_version = "${mavenVersion}.${env.BUILD_NUMBER}-DEVELOPMENT-SNAPSHOT"
                        mavenPublish(deploy_version)
                    } else if (env.BRANCH_NAME == 'regression') {
                        deploy_version = "${mavenVersion}.${env.BUILD_NUMBER}-REGRESSION-SNAPSHOT"
                        mavenPublish(deploy_version)
                    } else if (env.BRANCH_NAME == 'master') {
                        deploy_version = "${mavenVersion}.${env.BUILD_NUMBER}"
                        mavenPublish(deploy_version)
                    }
                }
            }
        }


        stage('Deploy'){
            steps {
                echo 'Deploy stage...'
                script {
                    echo env.BRANCH_NAME
                    if (env.BRANCH_NAME == 'development' || env.BRANCH_NAME == 'regression' || env.BRANCH_NAME == 'master') {
                        echo 'Maven Deploy method'
                        mavenDeploy(destinationFile: application_properties, sourceFile: application_template, propertiesYaml: properties_yaml, deployVersion: deploy_version, branch: env.BRANCH_NAME, deployPath: '', serviceRestart: '')
                    }
                }
            }
        }
    }

    post {
        always {
            echo 'Post build steps...'
            emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                    recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                    subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
        }
    }
}
