package com.codebook.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodebookServerApplication {

	public static void main(String[] args) {
		System.setProperty("jdk.tls.client.protocols", "TLSv1.2");
		SpringApplication.run(CodebookServerApplication.class, args);
	}
}
