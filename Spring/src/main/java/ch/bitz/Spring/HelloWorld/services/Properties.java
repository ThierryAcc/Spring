package ch.bitz.Spring.HelloWorld.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties implements HelloWorld {

	@Value("${text}")
	String text;
	
	@Override
	public void helloWorld() {
		System.out.println(text);
	}

}
