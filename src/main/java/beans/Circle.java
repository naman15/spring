package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import interfaces.Shape;

@Component
public class Circle implements Shape , ApplicationEventPublisherAware
{	
	@Autowired	
	private Point centre;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCentre() {
		return centre;
	}

	

	public void setCentre(Point centreParam) {
		this.centre = centreParam;
	}

	public void draw() 
	{
		System.out.println("Shape Drawn of circle from point - " + centre);
		publisher.publishEvent(new DrawEvent(this));
	}



	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) 
	{
		publisher=applicationEventPublisher;
	}

}
