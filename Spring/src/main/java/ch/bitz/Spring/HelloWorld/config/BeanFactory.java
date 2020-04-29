package ch.bitz.Spring.HelloWorld.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.bitz.Spring.DI.Dependency;
import ch.bitz.Spring.HelloWorld.services.HelloWorld;

@Configuration
@ComponentScan("HelloWorld")
@PropertySource("classpath:properties.properties")
public class BeanFactory {

	@Bean
	public HelloWorld anonymousDependency() {
		
		return new HelloWorld() {
			@Override
			public void helloWorld() {
				System.out.println("****************");
			}
		};
	}
	

	@Value("${text}")
	String text;
	
	@Bean
	public HelloWorld propertiesDependency() {
		
		return new HelloWorld() {
			@Override
			public void helloWorld() {
				System.out.println(text);
			}
		};
	}
}
