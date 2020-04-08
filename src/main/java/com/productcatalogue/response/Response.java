/**
 * 
 */
package com.productcatalogue.response;

/**
 * Mar 28, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
public class Response {

	private String status;
	private String message;
	private Object body;
	
	public Response(String status, String message, Object body) {
		this.status =  status;
		this.message = message;
		this.body = body;
	}
	
	public Response() {
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

}
