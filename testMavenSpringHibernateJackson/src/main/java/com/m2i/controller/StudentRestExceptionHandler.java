package com.m2i.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.m2i.rest.StudentErrorResponse;
import com.m2i.rest.StudentNotFoundException;

@ControllerAdvice
public class StudentRestExceptionHandler {
	
	// .value() pour retourner un int 
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse>handleException(StudentNotFoundException e){
			StudentErrorResponse ser = new StudentErrorResponse();
			ser.setStatus(HttpStatus.NOT_FOUND.value());
			ser.setMessage("l'id du student est invalide");
			ser.setTimestamps(System.currentTimeMillis());
			return new ResponseEntity<>(ser, HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse>handleException(NumberFormatException nb){
			StudentErrorResponse ser = new StudentErrorResponse();
			ser.setStatus(HttpStatus.NOT_FOUND.value());
			ser.setMessage("pas de string dans la case ID");
			ser.setTimestamps(System.currentTimeMillis());
			return new ResponseEntity<>(ser, HttpStatus.NOT_FOUND);
		}
		
		
		
		
		
	/*	// .value() pour retourner un int 
		//prends toutes les exceptions mais ne specifie pas l'erreur.
		 * pas de if si on prend la classe mere exception
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse>handleException(Exception e){
			StudentErrorResponse ser = new StudentErrorResponse();
			ser.setStatus(HttpStatus.NOT_FOUND.value());
			ser.setMessage("l'id du student est invalide");
			ser.setTimestamps(System.currentTimeMillis());
			return new ResponseEntity<>(ser, HttpStatus.NOT_FOUND);
		} */
}
