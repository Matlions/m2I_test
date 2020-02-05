package com.m2i.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/niveau1")
public class HomeController {
	//url à surveiller
	// vs 
	//url afficher dans page
	@RequestMapping("/")
	public String afficherPage() {
		System.out.println("contoller chemin 1");
		return "accueil";
	}
	
	
	
	@RequestMapping("/afficherPage")
	public String afficher2() {
		System.out.println("contoller chemin 1");
		return "formulaire";
		
	}
	
	@RequestMapping("/afficherResultat")
	public String afficherResultat() {
		System.out.println("contoller chemin 1");
		return "resultatFormulaire";
	}
	
	
	@RequestMapping("/afficherResultatMajuscule")
	public String afficherResultatMajuscule(HttpServletRequest r, Model m) {
		r.getParameter("nameMajuscule");
		String s = r.getParameter("nameMajuscule");
		m.addAttribute("nameMajuscule",s.toUpperCase());
		System.out.println("contoller chemin 1");
		return "resultatFormulaire";
	}
	
	@RequestMapping("/afficherResultatMajuscule2")
	public String afficherResultatMajuscule2(@RequestParam("nameMajuscule2")String s, Model m) {
		//r.getParameter("nameMajuscule2");
		//String s = r.getParameter("nameMajuscule2");
		m.addAttribute("nameMajuscule2","toto  "+ s.toUpperCase());
		System.out.println("contoller chemin 1");
		
		return "resultatFormulaire";
	}
}
