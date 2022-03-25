/**
 * 
 */
package com.java8learn.multithreading;

/**
 * @author mahallem
 *
 */
public class PrivateInstantiationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PrivateInstantiationException() {
		super();
	}
	
	public PrivateInstantiationException(String errorMessage) {
		super(errorMessage);
	}
	
	public PrivateInstantiationException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

	
}
