package com.anudipSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anudipSpring.config.Student;


public class App 
{
    public static void main( String[] args )
    {

    	@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student s = (Student) c.getBean("st");
        s.show();
        
        Student s1 = (Student) c.getBean("st1");
        s1.show();
    }
}
