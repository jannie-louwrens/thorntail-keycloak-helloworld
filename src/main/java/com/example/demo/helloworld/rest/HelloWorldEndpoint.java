package com.example.demo.helloworld.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet(@Context SecurityContext sc) {
		return Response.ok("Hello " + sc.getUserPrincipal().getName() + ", from a secure Thorntail!").build();
	}
}
