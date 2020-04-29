package ch.bitz.Spring.DI;

import org.springframework.stereotype.Component;

@Component("myOtherDependency")
public class DependencyImpl2 implements Dependency {

	@Override
	public void doSomething() {
		System.out.println("other stuff");
	}

	public DependencyImpl2() {
		super();
	}
	
	

}
