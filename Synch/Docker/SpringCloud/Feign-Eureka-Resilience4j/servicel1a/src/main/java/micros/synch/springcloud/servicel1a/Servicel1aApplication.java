package micros.synch.springcloud.servicel1a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Servicel1aApplication {

	public static void main(String[] args) {
		SpringApplication.run(Servicel1aApplication.class, args);
	}

}
