package com.akhm;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanLifeCycle implements InitializingBean,DisposableBean{
	@Value("${username}")
	private String myName;
	public void setMyName(String myName) {
		this.myName = myName;
		System.out.println("setter injection");
	}
	static
	{
		System.out.println("classloading");
	}
	public SpringBeanLifeCycle()
	{
		System.out.println("constructor");
	}
	@PostConstruct
	public void myInit()
	{
		System.out.println("init()");
	}
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("destroy");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("predefined destroy()");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("predefined init()");
		
	}

}
