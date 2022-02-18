/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author srini
 *
 */
@RestController

public class Controller {

@GetMapping("/hello")
public String helloWorld() {
return "Hello";	
}
}
