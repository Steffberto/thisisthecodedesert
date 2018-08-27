package com.pq.apprenticeship.de;

public class Triangle extends Stone {
	double lengthaTriangle = 0;
	double heightTriangleH = 0;
	/**
	 * print values
	 */
	public void printTriangle() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area + " " + "cm²");
	}
	/**
	 * random length for side a and height for b gets created.
	 */
	public void randomLengthandhightTriangle() {
		lengthaTriangle = (double)((Math.random()) * 100 + 1);
		heightTriangleH = (double)((Math.random()) * 100 + 1);
		
	}
	/**
	 * overriding area method
	 */
	@Override
	public void setArea() {
		area = 0.5 * lengthaTriangle * heightTriangleH;
	}
	/**
	 * overriding name method
	 */
	@Override
	public void setName() {
		name = "Triangle";
	}
	/**
	 * setting together all methods
	 */
	public void groundtwo() {
		randomColor();
		randomLengthandhightTriangle();
		setArea();
		setName();
		printTriangle();
	}

}
