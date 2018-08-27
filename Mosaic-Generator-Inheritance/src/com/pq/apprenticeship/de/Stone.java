package com.pq.apprenticeship.de;

public class Stone {
	//common characteristics
	String name;
	double area;
	String color;
	
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
	// eigentlich return Area
	public void setArea() {
		
	}
	// eigentlich return Name
	public void setName() {
		
	}
}