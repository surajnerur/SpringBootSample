package com.samplespringboot.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samplespringboot.bo.api.IAddressManager;
import com.samplespringboot.model.Address;

@Path("{empId}/address")
@Component
public class AddressRest {

	@Autowired
	private IAddressManager iAddressManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveAddressOfUser(Address address, @PathParam("empId") String empId) {
		boolean isAdded = iAddressManager.saveAddressOfUser(empId, address);
		if(isAdded) {
			return Response.status(Status.CREATED).entity(isAdded).build();
		} else{
			return Response.status(Status.NO_CONTENT).entity(isAdded).build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllAddressOfUser(@PathParam("empId") String empId) {
		return Response.status(Status.OK).entity(iAddressManager.getAllAddressOfUser(empId)).build();
	}
}
