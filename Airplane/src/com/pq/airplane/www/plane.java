package com.pq.airplane.www;

public class plane {
	public void planecivil() {
		String wings = "wings";
		String body = "a body";
		String cockpit = "a cockpit";
		String boardKitchen = "a boardkitchen";
		String restroom = "a restroom";
		String and = "and";
		
		System.out.println("Your airplane has:" + " " + wings + "," + " " + body + "," + " " + cockpit + "," + " " + boardKitchen + "," + " " + and + " "  + restroom + ".");
		Certainflight flight1 = new Certainflight();
		flight1.setPassengers();
		flight1.setSeats();
		
		movingplane flight1one = new movingplane();
		flight1one.fly();
	}		
}
