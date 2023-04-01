package com.akhm;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyLazyClass {
	public MyLazyClass()
	{
		System.out.println("myLazyClass constructor");
	}
	public String getMessege()
	{
		return "hi";
	}

}
