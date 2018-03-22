package application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Triangle;
import interfaces.Shape;

public class DrawingApp 
{
	static Shape shape;
	
	public static void main(String args[]) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		shape = (Triangle)context.getBean("triangle");
		shape.draw();
	}
}
