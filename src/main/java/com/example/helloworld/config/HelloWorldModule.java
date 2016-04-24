package com.example.helloworld.config;

import com.example.helloworld.dao.HelloWorldDao;
import com.example.helloworld.service.HelloWorldService;
import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		System.out.println("inside abstract module configure function");
		bind(HelloWorldDao.class);
		bind(HelloWorldService.class);
	}
}
