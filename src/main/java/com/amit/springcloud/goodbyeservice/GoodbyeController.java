package com.amit.springcloud.goodbyeservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
	
	@RequestMapping()
	public String goodbye() {
		return "Goodbye..";
	}

}
