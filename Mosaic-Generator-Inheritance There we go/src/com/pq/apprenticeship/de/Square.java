package com.pq.apprenticeship.de;

public class Square extends Stone {

	
	 public Square() {
		 super("Square");
		 double rectangleLengthA = (double)((Math.random()) * 100 + 1);
	     area = rectangleLengthA * rectangleLengthA;
	    }

}
