package br.com.daniel.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;
	
	public GreetingConfiguration() {
		super();
	}
	public GreetingConfiguration(String greeting, String defaultValue) {
		super();
		this.greeting = greeting;
		this.defaultValue = defaultValue;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
}
