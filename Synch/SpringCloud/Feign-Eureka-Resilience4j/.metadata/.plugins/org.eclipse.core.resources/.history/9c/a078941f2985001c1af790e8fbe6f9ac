package micros.synch.springcloud.servicel1a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicel1aController {

	@Autowired
	Environment env;

	@Autowired
	Servicel2aFeign servicel2aFeign;

	@GetMapping(value="/servicel1a")
	public String service1() {
		return "Servicel1a on port: " + env.getProperty("local.server.port");
	}

	@GetMapping(value="/servicel1aservicel2a")
	public String service2() {
		return "Servicel1a on port: " + env.getProperty("local.server.port") + " " + servicel2aFeign.service();
	}
}
