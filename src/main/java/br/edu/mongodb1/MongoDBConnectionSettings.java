package br.edu.mongodb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;

@Component
public class MongoDBConnectionSettings {
	
	@Autowired
	private MongoDBServerProperties properties;
	
	@Bean
	public MongoClient getMongoClient() {
		return new MongoClient(properties.getAddress(), properties.getPort());
	}
	
}
