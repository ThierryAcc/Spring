package ch.bitz.Spring.DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// spring sucht im hintergrund nach diesen klassen
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ch.bitz.spring");
		DependencyUser dependencyUser = context.getBean(DependencyUser.class);
		DependencyUser dependencyUser2 = context.getBean(DependencyUser.class);
		Dependency dependency = context.getBean("myOtherDependency", Dependency.class);
		System.out.println(dependencyUser);
		System.out.println(dependencyUser2);
		System.out.println(dependency);
		dependencyUser.test();
		
		context.close();
	}

}
