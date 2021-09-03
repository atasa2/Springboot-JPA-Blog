package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class HttpControllerTest {
	
	// http://localhost:8080/blog/http/get?id=1&username=asd
    @GetMapping("/http/get")
    public String getTest(Member m) {
    	return "get 요청: " + m.getId() + ", " + m.getUsername();
    }
    
    // http://localhost:8080/blog/http/post
    //  json
	//{
	//    "id": 1,
	//    "username": "deannn",
	//    "password": 123456,
	//    "email": "deannn@test.com"
	//}

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m) {
        return "post 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    
    @PostMapping("/http/postraw")
    public String postTestraw(@RequestBody String sss  ) {
        return "post 요청: " + sss;
    }
    
    
    
    
    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }
    
    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }	
	
	
    

}
