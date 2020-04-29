package ch.bitz.Spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyUser2 {
	
	// ohne autowired gibt es eine nullpointer weil null.test ausgeführt wird
//	@Autowired()
//	@Qualifier("myOtherDependency") // overruled primary
	Dependency mandatoryDependency;
	
//	@Autowired
//	public DependencyUser(@Qualifier("myOtherDependency") Dependency mandatoryDependency, @Qualifier("dependencyImpl") Dependency dependency) {
//		super();
//		this.mandatoryDependency = mandatoryDependency;
//	}

	public void test() {
		mandatoryDependency.doSomething();
	}

	@Autowired
	@Qualifier("myOtherDependency")
	public void setMandatoryDependency(Dependency mandatoryDependency) {
		this.mandatoryDependency = mandatoryDependency;
	}
}
