package com.pq.apprenticeship.de;

public class Circle extends Stone {

	double radiuscircle;
	
	 public Circle() {
		 super("Circle");
		 radiuscircle = (double)((Math.random()) * 100 + 1);
	     area = Math.PI * radiuscircle * radiuscircle;
	    }
}
