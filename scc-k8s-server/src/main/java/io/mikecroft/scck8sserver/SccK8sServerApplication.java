package io.mikecroft.scck8sserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SccK8sServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccK8sServerApplication.class, args);
	}

}
