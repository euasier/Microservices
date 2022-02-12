package micros.synch.springcloud.servicel2a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicel2aController {

	@Autowired
	Environment env;
	
	@GetMapping(value="/servicel2a")
	public String service() {
		return "Servicel2a on port: " + env.getProperty("local.server.port");
	}
}
