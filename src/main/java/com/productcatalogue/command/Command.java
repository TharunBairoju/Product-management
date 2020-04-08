package com.productcatalogue.command;

/**
 * 
 * Mar 28, 2020
 *
 *	@author Tharunkumar Bairoju
 *
 */
public interface Command<E, T> {
	public T execute(E request);
}
