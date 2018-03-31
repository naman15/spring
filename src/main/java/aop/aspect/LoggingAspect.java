package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice() 
	{
		System.out.println("Logging Advice Called");
	}
	
	@Before("allCircleMethods() || allSubPackageMethods()")
	public void securityAdvice() 
	{
		System.out.println("Security Advice Called");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {}
	
	@Pointcut("within(aop.model.CircleModel)")
	public void allCircleMethods(){}
	
	@Pointcut("within(aop.model.*)") // All Classes inside aop.model package
	public void allPackageMethods(){}
	
	@Pointcut("within(aop..*)") // All Classes inside aop package and its subpackages
	public void allSubPackageMethods(){}
	
}
