package com.sravan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEid(1);
        e.setEName("Sravan");
        e.setESalary(100);
        System.out.println(e);

        ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
        Employee e1= (Employee) context.getBean("emp1");
        System.out.println(e1);
        Resource resource = new ClassPathResource("employeebean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Employee e2=(Employee) beanFactory.getBean("emp1");
        System.out.println(e2);
    }
}
