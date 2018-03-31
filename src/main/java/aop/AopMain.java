package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.ShapeService;

public class AopMain 
{
	public static void main(String args[]) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = (ShapeService)context.getBean("shapeService");
		shapeService.getCircle().setName("DummyName");
		System.out.println("Drawing : " + shapeService.getCircle().getName());
		System.out.println("Drawing : " + shapeService.getTriangle().getName());
	}
}
