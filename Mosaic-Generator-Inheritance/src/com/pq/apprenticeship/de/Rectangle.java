package com.pq.apprenticeship.de;

public class Rectangle extends Stone {
	double lengthaRectangle = 0;
	double lengthbRectangle = 0;
	/**
	 * print values
	 */
	public void printRectangle() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area + " " + "cm²");
	}
	/**
	 * random length for side a and side b gets created. Also if length a and b are equal, it gets handled. 
	 */
	public void randomLengthsRectangle() {
		lengthaRectangle = (double)((Math.random()) * 100 + 1);
		lengthbRectangle = (double)((Math.random()) * 100 + 1);
		
		if(lengthaRectangle == lengthbRectangle)
		{
			double exeptionRectangle = 0;
			exeptionRectangle = (double)((Math.random()) * 100 + 1);
			lengthaRectangle = exeptionRectangle; 
		}
	}
	/**
	 * overriding area method
	 */
	@Override
	public void setArea() {
		area = lengthaRectangle * lengthbRectangle;
	}
	/**
	 * overriding name method
	 */
	@Override
	public void setName() {
		name = "Rectangle";
	}
	/**
	 * setting together all methods
	 */
	public void groundone() {
		randomColor();
		randomLengthsRectangle();
		setArea();
		setName();
		printRectangle();
	}
}
