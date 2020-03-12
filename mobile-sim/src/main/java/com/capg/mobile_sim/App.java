package com.capg.mobile_sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Mobile samsung;
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       samsung=(Mobile)context.getBean("mobile");
       samsung.browseInternet();
       samsung.makeACall();
    }
}
