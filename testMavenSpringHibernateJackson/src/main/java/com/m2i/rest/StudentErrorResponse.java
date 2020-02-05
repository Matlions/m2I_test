package com.m2i.rest;

public class StudentErrorResponse {
	long timestamps;
	int Status;
	String message;

	//constructor
	public StudentErrorResponse() {}
	
	//G & S
	
	public int getStatus() {	return Status;}
	public long getTimestamps() {return timestamps;}
	public void setTimestamps(long timestamps) {this.timestamps = timestamps;}
	public void setStatus(int status) {	Status = status;}
	public String getMessage() {return message;}
	public void setMessage(String message) {this.message = message;}
}
