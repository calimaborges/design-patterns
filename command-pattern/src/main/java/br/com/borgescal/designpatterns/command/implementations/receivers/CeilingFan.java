package br.com.borgescal.designpatterns.command.implementations.receivers;

public class CeilingFan {
	public enum Speed {OFF, LOW, MEDIUM, HIGH};
	String place;
	Speed speed;
	
	public CeilingFan(String place) {
		this.place = place;
		speed = Speed.OFF;
	}

	public Speed getSpeed() {
		return speed;
	}
	
	public void setSpeed(Speed speed) {
		this.speed = speed;
		System.out.println(place + "'s ceiling fan is " + this.getSpeed() +"!");
	}
}
