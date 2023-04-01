package com.akhm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("my1")
@Primary
public class MyImplementation1 implements MyInterface{

}
