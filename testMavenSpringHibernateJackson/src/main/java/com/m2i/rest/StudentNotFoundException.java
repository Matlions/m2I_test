package com.m2i.rest;

import com.sun.mail.iap.Response;

public class StudentNotFoundException extends RuntimeException{
	public StudentNotFoundException() {}

	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public StudentNotFoundException(String message) {
		super(message);
		
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	
	};
	/*public StudentNotFoundException(String message){};
	public StudentNotFoundException(Response response){};
	public StudentNotFoundException(String message,Response response){}
	public StudentNotFoundException(Throwable cause){}
	public StudentNotFoundException(Response response,Throwable cause) {}
	public StudentNotFoundException(String message,Response response,Throwable cause){}*/
}
