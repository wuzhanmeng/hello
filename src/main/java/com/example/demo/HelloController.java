package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		
		return "Hello World##1>>>>>>>>";
	}
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	public String hello(@RequestParam String name){
		
		return "Hello World##1>>>>>>>>"+name;
	}
	@RequestMapping(value="/hello2",method=RequestMethod.GET)
	public User getUser(@RequestHeader String id,@RequestHeader String name,@RequestHeader String age){
		System.out.println("User Objec############");
		return new User(id ,name, age );
	}
	@RequestMapping(value="/hello3" ,method=RequestMethod.POST)
	public String helloUser(@RequestBody User user){
		
		return "Hello World##1>>>>>>>" +"  "+user.getId()+"        "+user.getName() +"    "+ user.getAge();
	}
	
}
