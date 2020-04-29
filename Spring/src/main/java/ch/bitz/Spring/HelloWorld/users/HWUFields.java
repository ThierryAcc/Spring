package ch.bitz.Spring.HelloWorld.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.bitz.Spring.HelloWorld.services.HelloWorld;

@Component
public class HWUFields {
	@Autowired
	HelloWorld english;
	@Autowired
	HelloWorld deutsch;
	@Autowired
	HelloWorld french;
	@Autowired
	HelloWorld spanish;
	
	public void callAll() {
		english.helloWorld();
		deutsch.helloWorld();
		french.helloWorld();
		spanish.helloWorld();
	}
}
