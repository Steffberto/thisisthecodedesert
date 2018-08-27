package com.pq.apprenticeship.de;

public class Square extends Stone {
	double lengtha = 0;
	/**
	 * print values
	 */
	public void printSquare() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area + " " + "cm²");
	}
	//
	/**
	 * random length for side a gets created
	 */
	public void randomLengthSquare() {
		lengtha = (double)((Math.random()) * 100 + 1);
	}
	
	@Override
	/**
	 * overriding area method 
	 */
	public void setArea() {
		area = lengtha * lengtha;
	}
	
	@Override
	/**
	 * overriding name method 
	 */
	public void setName() {
		name = "Square";
	}
	/**
	 * setting together all methods
	 */
	public void groundzero() {
		randomColor();
		randomLengthSquare();
		setArea();
		setName();
		printSquare();
	}
}
