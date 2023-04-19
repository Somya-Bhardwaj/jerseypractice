package com.practice.jerseypractice;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAliens()
	{
		System.out.println("getAlien called...");
		
		return repo.getAliens() ;
	}
	
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien(@PathParam("id") int id) {
		
		return repo.getAlien(id);
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) {
		
		System.out.println(a1);
		repo.create(a1);
		return a1;
		
	}

}