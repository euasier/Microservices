package micros.synch.springboot.servicel1a;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="servicel2afeign", url="http://localhost:8002")
public interface Servicel2aFeign {
	
	@RequestMapping(method = RequestMethod.GET, value = "/servicel2a")
    String service();
}
