package com.akhm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyLazyTest implements InitializingBean{
	@Autowired
	private BeanFactory factory;
	public String getMesseges()
	{
		MyClass mc=factory.getBean(MyClass.class);
		MyLazyClass mlc=factory.getBean(MyLazyClass.class);
		return "bad morning";
	}
	{
		MyLazyClass mlc=factory.getBean(MyLazyClass.class);
		System.out.println(mlc.getMessege());
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		MyLazyClass mlc=factory.getBean(MyLazyClass.class);
		System.out.println(mlc.getMessege());
		
	}

}
