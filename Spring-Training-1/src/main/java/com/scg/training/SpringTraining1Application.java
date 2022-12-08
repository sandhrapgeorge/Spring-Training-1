package com.scg.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients
//@ComponentScan({ "com.scg.training.mapper" })
public class SpringTraining1Application {

	public static void main(final String[] args) {

		final ConfigurableApplicationContext context = SpringApplication.run(SpringTraining1Application.class, args);

	}

//	@Bean
//	public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			final String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (final String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//
//	}

}