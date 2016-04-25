package com.example.helloworld.service;

import com.example.helloworld.dao.HelloWorldDao;
import com.example.helloworld.dao.HelloWorldDupDao;
import com.google.inject.Inject;

public class HelloWorldService {

	private final HelloWorldDao helloWorldDao;

	private final HelloWorldDupDao helloWorldDupDao;
	@Inject
	public HelloWorldService(HelloWorldDao helloWorldDao,HelloWorldDupDao helloWorldDupDao) {
		super();
		this.helloWorldDao = helloWorldDao;
		this.helloWorldDupDao = helloWorldDupDao;
	}
	
	public void callPrintFunction(){
		System.out.println("printing inside service function");
		System.out.println("hello world print function dup");
		helloWorldDao.printFunction();
		helloWorldDupDao.printFunction();
	}
	
	
	
}
