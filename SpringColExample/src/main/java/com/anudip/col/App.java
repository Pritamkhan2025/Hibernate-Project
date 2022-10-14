package com.anudip.col;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anudip.col.entity.Course;

@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
    	Resource r = new ClassPathResource("applicationContext.xml");
    	BeanFactory b = new XmlBeanFactory(r);
    	Course c=(Course) b.getBean("course");
    	c.show();
        
    }
}
