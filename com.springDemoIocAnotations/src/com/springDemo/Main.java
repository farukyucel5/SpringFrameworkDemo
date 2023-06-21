package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IcustomerDal customerDal=context.getBean("database",IcustomerDal.class);
		customerDal.add();
		
		
		
}

}
