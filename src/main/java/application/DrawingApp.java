package application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.Shape;

public class DrawingApp 
{
	
	
	public static void main(String args[]) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape1 = (Shape)context.getBean("triangle");
		shape1.draw();
		Shape shape2 = (Shape)context.getBean("circle");
		shape2.draw();
	}
}
