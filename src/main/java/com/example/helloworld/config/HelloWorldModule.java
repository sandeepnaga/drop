package com.example.helloworld.config;

import com.example.helloworld.HelloWorldConfiguration;
import com.example.helloworld.dao.HelloWorldDao;
import com.example.helloworld.dao.HelloWorldDupDao;
import com.example.helloworld.service.HelloWorldService;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class HelloWorldModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		System.out.println("inside abstract module configure function");
		bind(HelloWorldDao.class);
		bind(HelloWorldService.class);
	}
	
	
	@Provides
	@Singleton
	HelloWorldDupDao getDupDao(Provider<HelloWorldConfiguration> configuration){
		System.out.println("inside abstract dao dup");
		return new HelloWorldDupDao("sa","bbd");
	}
}
