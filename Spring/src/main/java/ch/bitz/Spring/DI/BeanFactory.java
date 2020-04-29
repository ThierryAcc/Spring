package ch.bitz.Spring.DI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

// um z.B. auf DBs zuzugreifen
@Configuration // ist gleichzeitig Component Annotation
@ComponentScan({"Secret", "Secret2"}) // such mir noch im package secret
@PropertySource("classpath:properties.properties")
public class BeanFactory {

	ApplicationContext appContext;
	
	@Bean
	@Lazy
	public Dependency factoryDependency(@Value("${beanName}") String beanName) {
		System.out.println("creating factory dependency");
		
		return appContext.getBean(beanName, Dependency.class);
		
//		return new Dependency() {
//
//			@Override
//			public void doSomething() {
//				System.out.println("factoryDependency");
//			}
//		};
	}
}
