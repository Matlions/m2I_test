package com.m2i.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControllerAccueil {

	
	@RequestMapping("/")
	public String afficherPage() {
		return "accueil";
	}
}