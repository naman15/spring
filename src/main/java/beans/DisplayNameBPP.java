package beans;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBPP implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
	{
		System.out.println("called after post initalization : created bean + " + beanName);
		return bean;//neccassary
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
	{
		System.out.println("called after pre initalization : created bean + " + beanName);
		return bean;
	}

}
