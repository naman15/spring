package beans;

import interfaces.Shape;

public class Triangle implements Shape 
{
	private Point pointA;
	
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

}
