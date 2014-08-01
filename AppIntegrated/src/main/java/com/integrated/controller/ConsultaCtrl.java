package com.integrated.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.integrated.model.db.MongoCfg;
import com.integrated.model.dto.Usuarios;

@SuppressWarnings("resource")
public class ConsultaCtrl {
	private static ConsultaCtrl instance;
	private static MongoOperations mongoOperation;
	
	private ConsultaCtrl(){	
	}
	
	static{
		instance = new ConsultaCtrl();
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoCfg.class);
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	}
	
	public static ConsultaCtrl getInstance(){
		return instance;
	}
	
	public Usuarios findUserby(Usuarios usuario){
		Usuarios user = null;
		Query searchUserQuery = new Query(Criteria.where("usuario").is(usuario.getUsuario()));
		 
		user = mongoOperation.findOne(searchUserQuery, Usuarios.class);
		return user;
	}
}
