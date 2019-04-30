package com.samplespringboot.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.samplespringboot.bo.api.IEmployeeManager;
import com.samplespringboot.model.Employee;

@Path("/employees")
public class EmployeeRest {

	@Autowired
	private IEmployeeManager iEmployeeManager;
	
	@Autowired
	private AddressRest addressRest;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployees() {
		return Response.status(Status.OK).entity(iEmployeeManager.getAllEmployees()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee employee) {
		return Response.status(Status.CREATED).entity(iEmployeeManager.saveEmployee(employee)).build();
	}
	
	@DELETE
	public Response deleteEmployeeByEmployeeId(@QueryParam("empId") String empId) {
		boolean isDeleted = iEmployeeManager.deleteEmployeeByEmpId(empId);
		if(isDeleted) {
			return Response.status(Status.OK).entity(isDeleted).build();
		} else {
			return Response.status(Status.NO_CONTENT).entity(isDeleted).build();
		}
	}
	
	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeByEmployeeId(@PathParam("empId") String empId) {
		Employee employee = iEmployeeManager.findByEmpId(empId);
		if(employee == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.status(Status.FOUND).entity(employee).build();
	}
	
	@Path("{empId}/address")
	public AddressRest getAddress() {
		return addressRest;
	}	
}
