package com.itz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/HelloWorld")
@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/welcome")
	public String welcome() {
		String msg="<hr><center><h1>Jamshed</h1></center>";
		return msg;
	}//method

}//class
