package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("allGetters()")
	public void loggingAdvice() 
	{
		System.out.println("Logging Advice Called");
	}
	
	@Before("allGetters()")
	public void securityAdvice() 
	{
		System.out.println("Security Advice Called");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {};
}
