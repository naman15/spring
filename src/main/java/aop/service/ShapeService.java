package aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import aop.model.CircleModel;
import aop.model.TriangleModel;

public class ShapeService 
{
	@Autowired
	@Qualifier("circleModel")
	private CircleModel circle;
	
	@Autowired
	@Qualifier("triangleModel")
	private TriangleModel triangle;
	
	public CircleModel getCircle() {
		return circle;
	}
	public void setCircle(CircleModel circle) {
		this.circle = circle;
	}
	public TriangleModel getTriangle() {
		return triangle;
	}
	public void setTriangle(TriangleModel triangle) {
		this.triangle = triangle;
	}
}
