package com.pq.apprenticeship.de;

public class Rectangle extends Stone {

	
	 public Rectangle() {
		 super("Rectangle");
		 double rectangleLengthA = (double)((Math.random()) * 100 + 1);
		 double rectangleLengthB = (double)((Math.random()) * 100 + 1);
	     area = rectangleLengthA * rectangleLengthB;
	    }
	 
	 
}
