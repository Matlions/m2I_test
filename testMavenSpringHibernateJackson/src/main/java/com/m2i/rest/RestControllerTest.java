package com.m2i.rest;

import java.net.URI;
import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.m2i.dao.StudentDao;
import com.m2i.entity.Student;
import com.m2i.service.IStudentService;

@RestController
@RequestMapping("/api")
public class RestControllerTest {

	@Autowired
	IStudentService st;
	

	
	 @GetMapping("check")
	 public String status()
	 {
	  return "working";
	  }

	@GetMapping("student/{id}")
	public Student afficheStudentsApi(@PathVariable("id")int i) {
		Integer w = i;
		if(i < 0) {
		throw new StudentNotFoundException("id student non trouvée");
		
		}
		else if( !(w instanceof Integer )) {
			throw new NumberFormatException("pas de string dans ce champ");
		}else {
			System.out.println("contoller api affiche student id");
			return this.st.SearchStudent(i);
		}
		
	}
	
	@GetMapping("student/prenom/{prenom}")
	public ArrayList<Student> afficheStudentsPrenom(@PathVariable String prenom) {
		System.out.println("contoller api affiche student prenom");
		return this.st.afficheListStudents("prenom", prenom );
	}
	
	@GetMapping("student/nom/{nom}")
	public ArrayList<Student> afficheStudentsNom(@PathVariable String nom) {
		System.out.println("contoller api affiche student nom");
		return this.st.afficheListStudents("nom", nom );
	}
	

	@DeleteMapping("student/{id}")
	public ArrayList<Student>deleteStudent(@PathVariable("id")int i){
	System.out.println("contoller api delete student id");
	this.st.DeleteStudent(i);
	return this.st.afficheListStudents();
	}
	
	
	@GetMapping("students")
	public ArrayList<Student> afficherListeStudentsApi() {
		System.out.println("contoller api affiche get liste students");
		return this.st.afficheListStudents();
	}


	@PostMapping("add")
	public  void createStudent(@RequestBody Student student) {
		System.out.println("contoller api create post ");
		this.st.CreaStudent(student);
	}
	
	
	@PutMapping("miseAjour/id/{id}/prenom/{prenom}")
	public void updateStudentIdPrenom(@PathVariable("id")int i,
							@PathVariable("prenom")String prenom)
	{
		Student p =this.st.SearchStudent(i);
		p.setPrenom(prenom);
		System.out.println("controler api update put id prenom");
		this.st.UpdateUnStudent(p);
	}

	
	@PutMapping("miseAjour/id/{id}/nom/{nom}")
	public void updateStudentIdNom(@PathVariable("id")int i,
							@PathVariable("nom")String nom)
	{
		Student n =this.st.SearchStudent(i);
		n.setNom(nom);
		System.out.println("controler api update put id nom");
		this.st.UpdateUnStudent(n);
	}
	
	@PutMapping("miseAjour/ancienPrenom/{prenom}/nouveauPrenom/{prenom2}")
	public void upadateStudentPrenom(@PathVariable("prenom") String aprenom, 
							@PathVariable("prenom2") String nprenom) {
		System.out.println("controler api update put prenom seul");
		ArrayList<Student> z = this.st.getByParameter("prenom", aprenom);
		for(Student c: z) {
		((Student)c).setPrenom(nprenom);
		this.st.UpdateUnStudent(c);
		}
	}
}
