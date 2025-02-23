package pe.idat.edu.ec2_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ec2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2ConfigServerApplication.class, args);
	}

}
