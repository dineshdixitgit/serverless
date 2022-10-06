package com.dd.serverless;

import com.dd.json.Person;

public class First {

	static {
		System.out.println("com.dd.serverless.First Static block is Loaded");
	}

	public First() {
		System.out.println("Constructor com.dd.serverless.First");
	}
	
	public static void main(String[] args) {
		System.out.println("main executed");
	}

	public void check(String name) {
		System.out.println("First check is executed : "+name);
	}

	public String search(String name) {
		System.out.println("First search is executed : "+name);
		return "searching " + name;
	}
	
	public Person readPerson(Person person) {
		System.out.println("First readPerson is executed : "+person);
		person.modify("_tmp");
		return person;
	}	
}
