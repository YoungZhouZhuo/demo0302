package com.taiji.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taiji.pojo.User;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
    	System.out.println("---------开始----------");
        return "Hello World";
    }
    
     
    @RequestMapping("/getUser")
    public User getUser() {
    	System.out.println("---------开始----------");
    	User user=new User();
    	user.setId(2);
    	user.setName("李四");
        return user;
    }
    
    
}
