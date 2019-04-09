package demo.springboot.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootDockerHelloWorldController {

	@RequestMapping("/docker/hello")
	public String helloWorld() {
		return "Hello Docker World";
	}
}
