package com.pq.apprenticeship.de;

public class Stonereloded {
	//common characteristics
	String name;
	double area;
	String color;
	
	public void constructorclass(String name) {
		randomColor();
		getName(name);
		getArea();
		printValues();
	}
	/**
	 * random color is created
	 */
	public void randomColor() {
	
		int randomColor = 0;
		randomColor = (int)((Math.random()) * 4 + 1);
		{
		if(randomColor == 1)
		{
			color = "Red";
		}
		else if(randomColor == 2) {
			color = "Blue";
		}
		else if(randomColor == 3) {
			color = "Yellow";
		}
		else
			color = "Green";
		}
	}
	void getName(String name) {
		this.name = name;
		
	}
	
	public double getArea() {
		return area;
	}
	
	/**
	 * print values
	 */
	public void printValues() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area + " " + "cm²");
	}
}
