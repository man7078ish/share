package com.cg.javaintro.bean;

public class Circle extends Shape implements IMyInterface{

	
	private float radius;
	
	
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}



	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return super.getPi()*radius*radius;
	}
	
	public void show() {
		
		System.out.println("in class circle");
		
	}

}
