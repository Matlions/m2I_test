package com.m2i.demo.test;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ListeDeUserPostman {

 
public  UserTestPostman userTP;
 private ArrayList<UserTestPostman> listeUsers;
 

// getter et setters:
 
 public UserTestPostman getUserTP() {return userTP;}
 public void setUserTP(UserTestPostman userTP) {this.userTP = userTP;}
 public void setListeUsers(ArrayList<UserTestPostman> listeUsers) {this.listeUsers = listeUsers;}
 public ArrayList<UserTestPostman> getListeUsers() {return listeUsers;}
}
