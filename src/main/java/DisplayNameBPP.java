import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBPP implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
	{
		
		return null;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
	{
	
		return null;
	}

}