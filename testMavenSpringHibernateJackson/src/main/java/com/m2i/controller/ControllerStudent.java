package com.m2i.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m2i.entity.Student;
import com.m2i.service.IStudentService;


@Controller
@RequestMapping("/student")
public class ControllerStudent {
	
	@Autowired
	IStudentService st;
	
	@InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

	@RequestMapping("/")
	public String afficherPage() {
		System.out.println("contoller du Student");
		return "accueil";
	}
	
	@RequestMapping("/formulaireStudent")
	public String afficherFormulaireStudent(Model m) {
		System.out.println("contoller du Student student/formulaire");
		Student s = new Student();
		m.addAttribute("student", s);
		return "studentFormulaire";
	}
	
	@RequestMapping("/resultatFormulaireStudent")
	public String afficherResultatFormulaireStudent(@Valid @ModelAttribute("student")Student s, BindingResult bd) {
		System.out.println("contoller du Student student/resultatformulaire student");
		System.out.println("controller student : "+s);
		this.st.CreaStudent(s);
		//MethodStudent.DeleteStudent(s.getId());
		if(bd.hasErrors()) {
			return "studentFormulaire";
		}
		return "resultatFormulaireStudent";
	}
	
	@RequestMapping("/afficherListeStudents")
	public String afficherListeStudents(Model m) {
		System.out.println("contoller du student/afficherListeStudents");
		ArrayList<Student> s = this.st.afficheListStudents();
		m.addAttribute("listStudents", s);
		for(Student z:s) {
			System.out.println(z);
		}
		// utisier la methode qui permet d'afficher tous les étudiants depuis un service
		return "afficherListeStudents";
	}
	
	@RequestMapping("/delete")
	public String DeleteStudent(@ModelAttribute("student")int d) {
		System.out.println("contoller du student/supprimerUnStudent");
		System.out.println(d);

		this.st.DeleteStudent(d);
		System.out.println("student deleted");
		return "redirect:/student/afficherListeStudents";
		
	}
	
	@RequestMapping("/update")
	public String UpdateUnStudent(@ModelAttribute("student")int u, Model m) {
		System.out.println("contoller du student/updateUnStudent");
		System.out.println(u);
		Student s = new Student();
		s= this.st.SearchStudent(u);
		m.addAttribute("create", s);
		
		//this.st.UpdateUnStudent(s);
		System.out.println("student updated");
		return "studentFormulaireUpdate";
		
	}
	@RequestMapping("/updateFormulaireStudent")
	public String UpdateOnYVa(@ModelAttribute("create")Student z){
		System.out.println("contoller du student/updateFormulaireStudent");
		this.st.UpdateUnStudent(z);
		return "redirect:/student/afficherListeStudents";
	}
	
	
}
