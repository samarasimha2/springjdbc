package com.akhm;

import org.springframework.stereotype.Component;

@Component

public class MyClass {
	public MyClass()
	{
		System.out.println("myclass constructor");
	}
	public String getMessege()
	{
		return "hello";
	}

}
