package ch.bitz.Spring.HelloWorld.services;

import org.springframework.stereotype.Component;

@Component
public class French implements HelloWorld {

	@Override
	public void helloWorld() {
		System.out.println("Bonjour tout le monde");
	}

}
