package com.m2i.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.m2i.entity.Student;


public interface IStudentService {
	
	public void CreaStudent(Student s);
	public ArrayList<Student> afficheListStudents();
	public ArrayList<Student> afficheListStudents(String string, String prenom);
	public void DeleteStudent(int id);
	public void UpdateUnStudent(Student s);
	public Student SearchStudent(int u);
	public ArrayList<Student> getByParameter(String param, String value);
	

}
