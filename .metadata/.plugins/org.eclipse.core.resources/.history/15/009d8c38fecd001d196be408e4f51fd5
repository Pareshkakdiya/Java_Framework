package com.spring.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
        Student s1=(Student) a.getBean("s1");
        
        s1.setId(1);
        s1.setFname("Paresh");
        s1.setLname("Kakadiya");
        s1.setEmail("p.kakadiya@yahoo.com");
        
        System.out.println(s1);
        
        Student s2=(Student) a.getBean("s1");
        
        s2.setId(2);
        s2.setFname("Prajval");
        s2.setLname("Kakadiya");
        s2.setEmail("prajval@yahoo.com");
        
        System.out.println(s2);
    }
}
