package application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jpa.repository.EmployeeRepo;

public class JpaDemoClient 
{
	
	public static void main(String args[]) 
	{		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeRepo empRepo=context.getBean(EmployeeRepo.class);
		System.out.println(empRepo.getById(1));
		System.out.println(empRepo.insert("Naman", 9999));
		empRepo.deleteById(2);
	}
}
