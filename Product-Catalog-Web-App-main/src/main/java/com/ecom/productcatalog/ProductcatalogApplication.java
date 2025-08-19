package com.ecom.productcatalog;

import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import ch.qos.logback.classic.net.SocketNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductcatalogApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductcatalogApplication.class, args);
	}

}
