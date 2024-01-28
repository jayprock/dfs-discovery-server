package com.bitbus.dfsdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DfsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfsDiscoveryServerApplication.class, args);
	}

}
