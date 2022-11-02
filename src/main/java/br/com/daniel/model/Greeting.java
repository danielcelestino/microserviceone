package br.com.daniel.model;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.content = format;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}



}