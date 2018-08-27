package com.pq.apprenticeship.de;

import java.util.Scanner;

public class Controllcenter {
	
	int numberOfShapes = 51;
	int numberOfShapes2 = 51;
	
		/**
		 * Greeting, random number of shapes are being created.
		 * Question: Add shape?
		 * Question: Another mosaic?
		 */
		public void shapes() {
			System.out.println("Welcome! Your mosaik is being generated.");
			for(int i = 0; i <= numberOfShapes; i++)
			{
				int randomShape = (int)((Math.random()) * 4 + 1);
				
				{
	
					if(randomShape == 1)
					{
						Square alpha = new Square();
						alpha.groundzero();
					}
					else if(randomShape == 2) {
						Rectangle beta = new Rectangle();
						beta.groundone();
					}
					else if(randomShape == 3) {
						Triangle charlie = new Triangle();
						charlie.groundtwo();
					}
					else if(randomShape == 4) {
						Circle delta = new Circle();
						delta.groundthree();
					}
				
				}
	
			}
			
			System.out.println("Would you like to add another random shape to your mosaik? Type in Yes.");
			String addshape = "Yes";
			String insert;
			Scanner addshapeinsert = new Scanner(System.in);
			insert = addshapeinsert.nextLine();
			
			if(insert.equals(addshape) == addshape.equals(insert))
			{
					int randomShape = (int)((Math.random()) * 4 + 1);
				
				{
	
					if(randomShape == 1)
					{
						Square alpha = new Square();
						alpha.groundzero();
					}
					else if(randomShape == 2) {
						Rectangle beta = new Rectangle();
						beta.groundone();
					}
					else if(randomShape == 3) {
						Triangle charlie = new Triangle();
						charlie.groundtwo();
					}
					else if(randomShape == 4) {
						Circle delta = new Circle();
						delta.groundthree();
					}
				}	
			}
			
			System.out.println("Would you like to start a new mosaik? Type in Yes.");
			String addshape1 = "Yes";
			String insert1;
			Scanner addshapeinsert1 = new Scanner(System.in);
			insert1 = addshapeinsert1.nextLine();
			
			if(insert1.equals(addshape1) == addshape1.equals(insert1))
			{
				for(int i = 0; i <= numberOfShapes2; i++)
				{
					int randomShape = (int)((Math.random()) * 4 + 1);
					
					{
		
						if(randomShape == 1)
						{
							Square alpha = new Square();
							alpha.groundzero();
						}
						else if(randomShape == 2) {
							Rectangle beta = new Rectangle();
							beta.groundone();
						}
						else if(randomShape == 3) {
							Triangle charlie = new Triangle();
							charlie.groundtwo();
						}
						else if(randomShape == 4) {
							Circle delta = new Circle();
							delta.groundthree();
					}
				}
			}
		}
	}
}

