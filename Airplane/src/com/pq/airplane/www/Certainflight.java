package com.pq.airplane.www;

public class Certainflight extends plane {
	int seats = 0;
	int passengers = 0;
	
	public void setSeats() {
		seats = 150;
		System.out.println("In your airplane are" + " " + seats + " " + "seats.");
	}
	
	public void setPassengers() {
		passengers = 150;
		
		System.out.println("You are in the airplane with" + " " + passengers + " " + "passengers.");
	}
}
