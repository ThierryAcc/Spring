package ch.bitz.Spring.HelloWorld.services;

import org.springframework.stereotype.Component;

@Component
public class Spanish implements HelloWorld {

	@Override
	public void helloWorld() {
		System.out.println("Hola mundo");
	}

}
