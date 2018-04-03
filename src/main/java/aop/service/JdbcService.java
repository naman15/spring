package aop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.dao.JdbcDaoImpl;

public class JdbcService 
{
	public static void main(String args[]) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl daoObj= context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		System.out.println(daoObj.getCircleCount());
	}
}
