package com.example.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demojenkin {
	
@GetMapping("/get")
public String show() {
	String s = "Hello , Sreeja" + "Welcome to spring boot and jenkins";
	return s +"Id : 12890";
}

}
