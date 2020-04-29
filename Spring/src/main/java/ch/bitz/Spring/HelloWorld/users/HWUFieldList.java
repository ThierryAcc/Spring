package ch.bitz.Spring.HelloWorld.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ch.bitz.Spring.DI.Dependency;
import ch.bitz.Spring.HelloWorld.services.HelloWorld;

@Component
public class HWUFieldList {

	HelloWorld helloDependency;
	
	@Autowired
	List<Dependency> dependencies;
	
	public void callAll() {
		helloDependency.helloWorld();
	}
}
