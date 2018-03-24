package beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import interfaces.Shape;

public class Triangle implements Shape ,BeanNameAware,InitializingBean,DisposableBean
{
	private Point pointA;
	private ApplicationContext context=null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public  void draw() 
	{
		System.out.println("Shape Drawn from Point - " + pointA);
	}

	

	public void destroy() throws Exception {
		System.out.println("Bean Destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean created");
	}

	public void setBeanName(String arg0) {
		System.out.println("Bean ->" + arg0 +" formed");
	}

}
