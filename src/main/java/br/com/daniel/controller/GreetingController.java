package br.com.daniel.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.configuration.GreetingConfiguration;
import br.com.daniel.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = "%s, %s!";

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreetingConfiguration config;

	@RequestMapping("/greeting")
	private Greeting greeting(@RequestParam(value = "name", defaultValue = "") String name) {
		if(name.isEmpty()) {
			name = config.getDefaultValue();
		}
		return new Greeting(counter.incrementAndGet(), String.format(template, config.getGreeting(), name));
	}

}
