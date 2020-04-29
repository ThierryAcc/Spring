package ch.bitz.Spring.HelloWorld.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ch.bitz.Spring.HelloWorld.services.HelloWorld;

@Component
public class HWUConstructor {
	HelloWorld english;
	HelloWorld deutsch;
	HelloWorld spanish;
	HelloWorld french;
	
	@Autowired
	public HWUConstructor(@Qualifier("english") HelloWorld english, 
			@Qualifier("deutsch") HelloWorld deutsch, 
			@Qualifier("french") HelloWorld french, 
			@Qualifier("spanish") HelloWorld spanish) {
		this.english = english;
		this.deutsch = deutsch;
		this.spanish = spanish;
		this.french = french;
	}
	
	public void callAll() {
		english.helloWorld();
		deutsch.helloWorld();
		spanish.helloWorld();
		french.helloWorld();
	}
}
