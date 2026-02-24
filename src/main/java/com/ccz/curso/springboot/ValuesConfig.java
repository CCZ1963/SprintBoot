package com.ccz.curso.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:values3.properties"),
        @PropertySource("classpath:values4.properties")
})
public class ValuesConfig {

}
