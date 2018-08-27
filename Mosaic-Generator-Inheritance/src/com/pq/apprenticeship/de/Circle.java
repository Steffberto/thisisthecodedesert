package com.pq.apprenticeship.de;

public class Circle extends Stone {
	double radiuscircle = 0;

	/**
	 * print values
	 */
	public void printCircle() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area + " " + "cm²");
	}
	/**
	 * random length for radius gets created.
	 */
	public void randomradiuscircle() {
		radiuscircle = (double)((Math.random()) * 100 + 1);
	}
	/**
	 * overriding area method
	 */
	@Override
	public void setArea() {
		area = Math.PI * radiuscircle * radiuscircle;
	}
	/**
	 * overriding name method
	 */
	@Override
	public void setName() {
		name = "Circle";
	}
	/**
	 * setting together all methods
	 */
	public void groundthree() {
		randomColor();
		randomradiuscircle();
		setArea();
		setName();
		printCircle();
	}
}
