package com.appsdeveloperblog.ws.clients.photoappwebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PhotoAppWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppWebClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
