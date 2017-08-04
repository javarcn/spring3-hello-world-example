package com.javarcn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld= (HelloWorld) context.getBean("helloBean");
        helloWorld.printHello();
    }
}
