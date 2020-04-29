package ch.bitz.Spring.HelloWorld.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.bitz.Spring.HelloWorld.services.HelloWorld;

@Component
public class HWUSetter {

	HelloWorld english;
	
	@Autowired
	public void setHelloDependency(HelloWorld helloDependency) {
		this.helloDependency = helloDependency;
	}
	
	public void callAll() {
		helloDependency.helloWorld();
	}
}
