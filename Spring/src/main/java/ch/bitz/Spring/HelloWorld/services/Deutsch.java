package ch.bitz.Spring.HelloWorld.services;

import org.springframework.stereotype.Component;

@Component
public class Deutsch implements HelloWorld {

	@Override
	public void helloWorld() {
		System.out.println("Hallo Welt");
	}

}
