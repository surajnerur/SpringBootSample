package com.samplespringboot.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.samplespringboot.rest.HelloWorld;

@Component
@ApplicationPath("/springwithjersey")
public class ApplicationConfig extends ResourceConfig {

 public ApplicationConfig() {
	 register(HelloWorld.class);
 }
}
