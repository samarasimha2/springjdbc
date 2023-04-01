package com.akhm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Customer {
	@Autowired(required = false)
	private Address address;
	@Autowired
	private Date dateOfBirth;
	@Autowired
	@Qualifier("my1")
	private MyInterface myInterface;
	@Value("${username}")
	private String userName;
	@Value("${password}")
	private String password;

}
