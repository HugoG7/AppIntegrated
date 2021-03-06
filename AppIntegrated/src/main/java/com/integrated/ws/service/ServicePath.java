package com.integrated.ws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.integrated.controller.ConsultaCtrl;
import com.integrated.model.dto.Usuarios;

@Path("/")
public class ServicePath {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuarios getTrackInJson(@QueryParam("user") String user){
		Usuarios usuario = new Usuarios();
		usuario.setUsuario(user);
		return ConsultaCtrl.getInstance().findUserby(usuario);
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJson(Usuarios usuario){
		String result = "Usuario Guardado: "+ usuario;
		return Response.status(201).entity(result).build();
	}
}
