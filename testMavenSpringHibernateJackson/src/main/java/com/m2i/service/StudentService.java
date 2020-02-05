package com.m2i.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.dao.StudentDao;
import com.m2i.entity.Student;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private StudentDao dao;
	
	public StudentService() {
			}
	
	@Transactional
	public void CreaStudent(Student s) {
		 this.dao.CreaStudent(s);
	}
	
	
	@Transactional
	public ArrayList<Student> afficheListStudents() {
		return this.dao.afficheListStudents();
	}

	
	@Transactional
	public void DeleteStudent(int id) {
		this.dao.DeleteStudent(id);
		
	}
	
	@Transactional
	public void UpdateUnStudent(Student s) {
		this.dao.UpdateUnStudent(s);
	
	}

	@Transactional
	public Student SearchStudent(int u) {
		return this.dao.SearchStudent(u);
	}

	@Transactional
	public ArrayList<Student> afficheListStudents(String string, String prenom) {
		return this.dao.afficheListStudents(string, prenom);
	}

	@Transactional
	public ArrayList<Student> getByParameter(String param, String value) {
		return this.dao.getByParameter(param, value);
	}
	
}
