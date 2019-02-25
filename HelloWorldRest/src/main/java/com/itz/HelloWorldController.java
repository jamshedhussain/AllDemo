package com.itz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/HelloWorld")
@RestController
public class HelloWorldController {
	
	@GetMapping(value="/welcome1")
	public String welcome() {
		String msg="<hr><center><h1>Jamshed</h1></center>";
		return msg;
	}//method

}//class
