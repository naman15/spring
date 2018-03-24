package beans;

import interfaces.Shape;

public class Circle implements Shape 
{	
	private Point centre;
	
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centreParam) {
		this.centre = centreParam;
	}

	public void draw() 
	{
		System.out.println("Shape Drawn of circle from point - " + centre.hashCode());
	}

}
