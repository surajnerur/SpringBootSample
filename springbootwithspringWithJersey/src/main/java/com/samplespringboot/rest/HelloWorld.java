package com.samplespringboot.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.samplespringboot.bo.api.IHello;

@Path("/helloworld")
public class HelloWorld {

	@Autowired
	public IHello iHello;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloWorld() {
		return iHello.getHelloWorld();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList() {
		return Response.status(Status.OK).entity(iHello.getList()).build();
	}
}
