package com.pq.apprenticeship.de;

public class Triangle extends Stone {
	
	 public Triangle() {
		 super("Triangle");
		 double triangleLengthC = (double)((Math.random()) * 100 + 1);
		 double triangleHeigthH = (double)((Math.random()) * 100 + 1);
	     area = 0.5 * triangleLengthC * triangleHeigthH;
	    }
}
