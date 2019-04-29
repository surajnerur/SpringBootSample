package com.samplespringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWithJerseyApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		new SpringWithJerseyApplication().configure(new SpringApplicationBuilder(SpringWithJerseyApplication.class)).run(args);
	}
}
