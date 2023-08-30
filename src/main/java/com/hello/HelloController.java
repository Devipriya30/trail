package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
RestTemplate rest=new RestTemplate();
@GetMapping(value="/gethiviahello")
public String gethiviahello() {
	String url="http://localhost:8080/admin1/sendhi";
	String response=rest.getForObject(url,String.class);
	
	return response;

}

}
//exchange(url,HttpMethod.GET,null,String.class);