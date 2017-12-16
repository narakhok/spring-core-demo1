package com.kshrd.spring_core_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kshrd.service.Drawing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("drawingContext.xml");
    	Drawing draw = ctx.getBean(Drawing.class);
    	draw.Draw();
        /*System.out.println( "Hello World!" );*/
    }
}
