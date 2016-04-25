package com.example.helloworld.dao;

public class HelloWorldDupDao {

	private String var1;
	private String var2;
	
	

	public HelloWorldDupDao() {
		super();
	}

	public HelloWorldDupDao(String var1, String var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}

	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public String getVar2() {
		return var2;
	}

	public void setVar2(String var2) {
		this.var2 = var2;
	}

	public String printFunction(){
		
		System.out.println("inside duplicate dao of helloworld" + this.var1);
		System.out.println("inside duplicate dao of var 2 =" + this.var2);
		return "from Dup Dao";
	}
}
