package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	// http://localhost:8080/blog/temp/home
	@GetMapping("temp/home")
    public String tempHome() {
    	return "/home.html";
    }
	
	// spring mvc: view: prefix: /WEB-INF/views/
	// http://localhost:8080/blog/temp/jsp
	@GetMapping("temp/jsp")
    public String tempJsp() {
    	return "test";
    }
	
	
	
}







