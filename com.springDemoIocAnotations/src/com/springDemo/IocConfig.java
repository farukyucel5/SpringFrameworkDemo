package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springDemo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	@Bean
	public IcustomerDal database() {
		return new MySqlCustomerDal();
	}

	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
	
	

}
