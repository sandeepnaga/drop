package com.example.helloworld.tasks;

import java.io.PrintWriter;

import com.google.common.collect.ImmutableMultimap;

import io.dropwizard.servlets.tasks.Task;

public class TestingTask extends Task {

	public TestingTask(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(ImmutableMultimap<String, String> arg0, PrintWriter arg1)
			throws Exception {
		System.out.println("printing execute method of taks ");
		
	}
}
