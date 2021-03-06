package micros.synch.springboot.servicel1a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicel1a {

	@Autowired
	Servicel2aFeign servicel2aFeign;

	@GetMapping(value="/servicel1a")
	public String service1() {
		return "Servicel1a";
	}

	@GetMapping(value="/servicel1aservicel2a")
	public String service2() {
		return "Servicel1a" + servicel2aFeign.service();
	}
}
