package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.Shape;

@Component
public class Circle implements Shape 
{	
	@Autowired	
	private Point centre;
	
	
	public Point getCentre() {
		return centre;
	}

	

	public void setCentre(Point centreParam) {
		this.centre = centreParam;
	}

	public void draw() 
	{
		System.out.println("Shape Drawn of circle from point - " + centre);
	}

}
