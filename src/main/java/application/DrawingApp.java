package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Triangle;
import interfaces.Shape;

public class DrawingApp 
{
	static Shape shape;
	
	public static void main(String args[]) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		shape = (Triangle)context.getBean("triangle");
		shape.draw();
	}
}
