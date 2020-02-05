package com.m2i.dao;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.m2i.entity.Student;


@Repository
public class StudentDao {
	
	@Autowired
	private SessionFactory factory;
	
	
	public StudentDao() {
		super();
	}


	//on a enlever le arrobaz transactionnal il est dans service
	public void CreaStudent(Student s) {
		
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		System.out.println("dao student : "+s);
		//session.beginTransaction();
		session.persist(s);
		//session.getTransaction().commit();
		//session.close();
		//factory.close();
	}
	
	//on a enlever le arrobaz transactionnel il est dans service
	public ArrayList<Student> afficheListStudents() {
		ArrayList<Student>listStudents = new ArrayList<Student>();
		Session session = factory.getCurrentSession();
		listStudents = (ArrayList<Student>) session.createQuery("FROM Student").list();
//		for(Student s:listStudents) {
//			System.out.println(s);
//		}
		return listStudents;
	}
	
	public ArrayList<Student>afficheListStudents(String searchurl, String searchValue){
		Session session = factory.getCurrentSession();
		ArrayList<Student>listStudentUrl= this.afficheListStudents();
		ArrayList<Student>listStudentValue= new ArrayList<Student>();
		for(Student s :listStudentUrl ) {
			
			if(searchurl.equals("prenom")) {
				
				if(s.getPrenom().equals(searchValue)) {
					listStudentValue.add(s);
				}
			}
			else if(searchurl.equals("nom")) {
				if(s.getNom().equals(searchValue)) {
					listStudentValue.add(s);
				}
			}
		}
		return listStudentValue;
	}
	
	
	
	
	public void DeleteStudent(int id) {
		
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		//session.beginTransaction();
		Student d = session.get(Student.class, id);
		System.out.println(d);
		session.delete(d);
		//session.getTransaction().commit();
		//session.close();
		
	}
	
	public Student SearchStudent(int s) {
		Session session = factory.getCurrentSession();
		Student search = session.get(Student.class, s);
		System.out.println(search);
		return search;
	}
	
/*	public ArrayList<Student> getByPrenom(String prenom) {
		Session session = factory.getCurrentSession();
		Query q =session.createQuery("FROM Student WHERE prenom like :p");
		q.setParameter("p", "%"+prenom+"%");
		return (ArrayList<Student>) q.list();
	}
*/
	public ArrayList<Student> getByParameter(String param,String value) {
		Session session = factory.getCurrentSession();
		Query q =session.createQuery("FROM Student WHERE "+param+" like :v");
		q.setParameter("v", value);
		return (ArrayList<Student>) q.list();
	}
	
	public void UpdateUnStudent(Student s) {
		Session session = factory.getCurrentSession();
		System.out.println(s.getId());
		System.out.println("aaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		 Student stuObj = (Student) session.get(Student.class, s.getId() );
	     stuObj.setPrenom(s.getPrenom());
	     stuObj.setNom(s.getNom());
	     stuObj.setEmail(s.getEmail());
	     stuObj.setAddress(s.getAddress());
	}	
}
