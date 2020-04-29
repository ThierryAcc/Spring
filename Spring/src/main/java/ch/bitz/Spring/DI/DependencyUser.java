package ch.bitz.Spring.DI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DependencyUser {
	
	// ohne autowired gibt es eine nullpointer weil null.test ausgeführt wird
	//@Autowired()
	//@Qualifier("myOtherDependency") // overruled primary
	
	@Autowired
	@Qualifier("dependencyImpl")
	List<Dependency> dependencies;
	
	//@Autowired
	//@Qualifier("factoryDependency")
	//@Lazy
	Dependency mandatoryDependency;
	
//	@Autowired
//	public DependencyUser(@Qualifier("myOtherDependency") Dependency mandatoryDependency, @Qualifier("dependencyImpl") Dependency dependency) {
//		super();
//		this.mandatoryDependency = mandatoryDependency;
//	}

	public void test() {
		mandatoryDependency.doSomething();
	}

//	@Autowired
//	@Qualifier("myOtherDependency")
//	public void setMandatoryDependency(Dependency mandatoryDependency) {
//		this.mandatoryDependency = mandatoryDependency;
//	}
}
