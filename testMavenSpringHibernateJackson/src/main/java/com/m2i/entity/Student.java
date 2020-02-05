package com.m2i.entity;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="student")
public class Student {

	//attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message=" prenom ne peut pas être nul")
	@Column(name="prenom")
	private String prenom;
	
	@NotNull(message="nom ne peut pas être nul")
	@Column(name="nom")
	private String nom;
	
	@Email(message="Please provide a valid email address")
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	@NotNull(message="addresse ne peut pas être nul")
	private String address;
	


	//constructeur

	public Student() {
	}
	
	


	// toString 
	public String toString() {
		String resultat =  super.toString() ;  
	    resultat +=  "\nprenom : " + prenom ;   
	    resultat +=  "\nnom : " + nom ;   
	    resultat +=  "\nemail : " + email ; 
	    resultat +=  "\naddress : " + address ; 
		return resultat ;
	}
	
	
	//getters et setters

	public String getPrenom() {return prenom;}

	public void setPrenom(String prenom) {this.prenom = prenom;}

	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public String getAddress() {return address;}

	public void setAddress(String address) {this.address = address;}

	public int getId() {return id;}

	public void setId(int id) {this.id = id;}
}