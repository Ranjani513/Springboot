package com.nisum.EmployeeManagement;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nisum.EmployeeManagement.model.Employee;
@Path("/emp")
public class EmployeeService {
 @GET
 @Path("/get/{empID}")
 @Produces(MediaType.APPLICATION_XML)
 public Employee getEmployee(@PathParam("empId") String empID) {
	Employee employee=new Employee();
	employee.setEmpId(empID);
	employee.setName("ranjani");
	employee.setEmail("Ranjani123@gmail.com");
	 return employee;
	 
 }
 @POST
 @Path("/create")
 @Consumes(MediaType.APPLICATION_XML)
 @Produces(MediaType.APPLICATION_XML)
 public Employee createEmployee(Employee employee) {
	 employee.setName(employee.getName()+ "created");
	 return employee;
 }
 @PUT
 @Path("/update")
 @Consumes(MediaType.APPLICATION_XML)
 @Produces(MediaType.APPLICATION_XML)
 public Employee UpdateEmployee(Employee employee) {
	 employee.setName(employee.getName()+ "updated");
	 return employee;
 }
@DELETE
@Path("/delete/{empID}")

public Response deleteEmployee(@PathParam("empID") int empID) throws URISyntaxException{
	return Response.status(200).entity("Employee with"+empID + "is deleted successfully").build();
}
}