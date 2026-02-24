package com.ccz.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource("classpath:values.properties") //Configuraciones exteriorizadas
@PropertySources({
		@PropertySource("classpath:values1.properties"),
		@PropertySource("classpath:values2.properties")
})
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

}
