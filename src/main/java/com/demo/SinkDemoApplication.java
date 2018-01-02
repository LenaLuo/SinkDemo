package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SinkDemoApplication {
	  private static Logger logger = LoggerFactory.getLogger(SinkDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SinkDemoApplication.class, args);
	}
	
	 @StreamListener(Sink.INPUT)
	 public void sinkMessage(Object message){
	        logger.info("received message: "+message);
	    }
}
