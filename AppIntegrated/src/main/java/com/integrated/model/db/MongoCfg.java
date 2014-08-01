package com.integrated.model.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoCfg extends AbstractMongoConfiguration{
	
	@Override
	public String getDatabaseName(){
		return "Empresa";
	}
	
	@Bean
	public Mongo mongo() throws Exception{
		return new MongoClient("localhost", 27017);
	}
}
