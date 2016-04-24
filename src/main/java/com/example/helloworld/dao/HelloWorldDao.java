package com.example.helloworld.dao;

public class HelloWorldDao {

	private String testVariable = "sandeep";

	public String getTestVariable() {
		return testVariable;
	}

	public void setTestVariable(String testVariable) {
		this.testVariable = testVariable;
	}

	
	public String printFunction(){
		System.out.println("printing line in dao");
		return "printed";
	}
}
