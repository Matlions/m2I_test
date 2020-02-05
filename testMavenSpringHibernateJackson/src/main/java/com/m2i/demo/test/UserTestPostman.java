package com.m2i.demo.test;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserTestPostman {
	
	int userId;
	int id;
	String title;
	Boolean completed;
	int count;
	

	@Override	public String toString() {
		return "UserTestPostman [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed
				+ "]";
	}



	//constructeurs
	public UserTestPostman() {
		this.count +=1;
	}


	// getters and setters
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getCompleted() {return completed;}

	public void setCompleted(Boolean completed) {this.completed = completed;}
	
	public int getCount() {return count;}

	public void setCount(int count) {this.count = count;}
}
