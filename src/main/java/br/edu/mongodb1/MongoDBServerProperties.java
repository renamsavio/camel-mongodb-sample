package br.edu.mongodb1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MongoDBServerProperties {
    
	@Value("${mongodb.address}")
	private String address;

	@Value("${mongodb.port}")
	private int port;

	public String getAddress() {
		return address;
	}

	public int getPort() {
		return port;
	}

}
