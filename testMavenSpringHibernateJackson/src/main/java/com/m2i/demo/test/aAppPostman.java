package com.m2i.demo.test;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class aAppPostman {
	public static void main(String []args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		URL url = new URL("http://jsonplaceholder.typicode.com/todos");
		ArrayList<UserTestPostman> list_userPost = mapper.readValue(url,new TypeReference<ArrayList<UserTestPostman>>() {});
		
		int count = 0;
		for(UserTestPostman uT: list_userPost) {
		
		count +=1;
		System.out.println(count);	
		System.out.println(uT);		
		}
	}
}
