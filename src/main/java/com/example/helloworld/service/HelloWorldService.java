package com.example.helloworld.service;

import com.example.helloworld.dao.HelloWorldDao;
import com.google.inject.Inject;

public class HelloWorldService {

	private final HelloWorldDao helloWorldDao;

	@Inject
	public HelloWorldService(HelloWorldDao helloWorldDao) {
		super();
		this.helloWorldDao = helloWorldDao;
	}
	
	public void callPrintFunction(){
		System.out.println("printing inside service function");
		helloWorldDao.printFunction();
	}
	
	
	
}
