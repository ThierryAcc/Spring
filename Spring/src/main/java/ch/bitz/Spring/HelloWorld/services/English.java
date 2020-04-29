package ch.bitz.Spring.HelloWorld.services;

import org.springframework.stereotype.Component;

@Component
public class English implements HelloWorld {

	@Override
	public void helloWorld() {
		System.out.println("Hello World");
	}
}
