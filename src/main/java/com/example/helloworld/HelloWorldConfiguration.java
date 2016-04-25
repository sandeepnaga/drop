package com.example.helloworld;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.helloworld.dao.HelloWorldDupDao;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldConfiguration extends Configuration {

	@NotEmpty
	private String template;

	@NotEmpty
	private String defaultName = "Stranger";
	
	private HelloWorldDupDao helloWorldDupDao ;
	

	public HelloWorldDupDao getHelloWorldDupDao() {
		return helloWorldDupDao;
	}

	public void setHelloWorldDupDao(HelloWorldDupDao helloWorldDupDao) {
		this.helloWorldDupDao = helloWorldDupDao;
	}

	//@JsonProperty
	public String getTemplate() {
		return template;
	}

	//@JsonProperty
	public void setTemplate(String template) {
		this.template = template;
	}

	//@JsonProperty
	public String getDefaultName() {
		return defaultName;
	}

	//@JsonProperty
	public void setDefaultName(String name) {
		this.defaultName = name;
	}
}
