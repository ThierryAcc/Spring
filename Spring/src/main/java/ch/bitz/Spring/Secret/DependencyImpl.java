package ch.bitz.Spring.Secret;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import ch.bitz.Spring.DI.Dependency;

@Component
// @Primary // macht den zur erstgewählten Dependency
@Lazy // steuern wann bean erstellt werden soll
public class DependencyImpl implements Dependency {

	// whole mir die value aus dem properties file
	@Value("${mystring}")
	String text;
	
	public DependencyImpl() {
		System.out.println("building Dependencyimpl");
	}

	@Override
	public void doSomething() {
		System.out.println("stuff " + text);
	}

}
