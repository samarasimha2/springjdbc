package com.akhm;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
public class MyConfiguration {
	@Bean
	public Date getDate()
	{
		return new Date();
	}

}
