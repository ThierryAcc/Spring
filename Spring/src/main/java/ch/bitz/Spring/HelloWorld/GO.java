package ch.bitz.Spring.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch.bitz.Spring.HelloWorld.users.HWUConstructor;
import ch.bitz.Spring.HelloWorld.users.HWUFields;

public class GO {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ch.bitz.spring.HelloWorld");
		HWUConstructor hwuConstructor = context.getBean(HWUConstructor.class);
		HWUFields hwuFields = context.getBean(HWUFields.class);
		
		hwuConstructor.callAll();
		hwuFields.callAll();
	}

}
