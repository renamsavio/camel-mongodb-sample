package br.edu.mongodb1;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MySpringBootRouter extends RouteBuilder {

    @Override
    public void configure() {
        
        from("jetty:http://localhost:8181/mongoSelect")
        .to("mongodb:getMongoClient?database=test&collection=restaurants&operation=findAll")
        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        .transform().simple("${body}");
    }

}
