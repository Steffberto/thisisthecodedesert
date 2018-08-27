package com.pq.apprenticeship.de;

public class Stone {
	//common characteristics
		private String name;
		protected double area;
		private String color;
		
		public Stone(String name) {
			super();
			this.name = name;
			randomColor();
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
		/**
		 * print values
		 */
		public void printValues() {
			System.out.println(name);
			System.out.println(color);
			System.out.println(area + " " + "cm²");
		}
}