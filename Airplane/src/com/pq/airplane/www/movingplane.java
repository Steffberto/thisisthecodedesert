package com.pq.airplane.www;

public class movingplane extends plane{
	
	public void moveToRunway()
	{
		System.out.println("The Airplane is moving now to runway.");
	}
	
	public void startFromRunway()
	{
		System.out.println("The Airplane just started from airport.");
	}
	
	public void landOnRunway()
	{
		System.out.println("The Airplane just landed at the airport.");
	}
	
	public void getToGate()
	{
		System.out.println("The airplane is now driving to the gate.");
	}
	
	public void fly()
	{
		moveToRunway();
		startFromRunway();
		landOnRunway();
		getToGate();
	}
}
