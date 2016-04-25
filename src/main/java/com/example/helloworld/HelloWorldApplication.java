package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.example.helloworld.config.HelloWorldModule;
import com.example.helloworld.health.TemplateHealthCheck;
import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.HelloWorldConfiguration;
import com.google.inject.Guice;
import com.hubspot.dropwizard.guice.GuiceBundle;

//import com.example.helloworld.health.TemplateHealthCheck;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
   
	private GuiceBundle<HelloWorldConfiguration> guiceBundle;
	
	public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    	 GuiceBundle.Builder<HelloWorldConfiguration> guiceBundleBuilder = GuiceBundle.newBuilder();
 	    guiceBundle = guiceBundleBuilder.addModule(new HelloWorldModule()).build();
 	   bootstrap.addBundle(guiceBundle);
 	        
     // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
    	System.out.println(configuration.getHelloWorldDupDao().getVar1()+ "******inside run to var1");
    	final HelloWorldResource resource = new HelloWorldResource(
    	        configuration.getTemplate(),
    	        configuration.getDefaultName()
    	    );
    	    environment.jersey().register(resource);
    	    
    	    final TemplateHealthCheck healthCheck =
    	            new TemplateHealthCheck(configuration.getTemplate());
    	        environment.healthChecks().register("template", healthCheck);
    	        environment.jersey().register(resource);
    	        
    	        System.out.println("in application run**************");
    	   
    }

}