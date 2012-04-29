package br.com.borgescal.designpatterns.command.implementations.receivers;

public class CeilingFan {
	String place;
	
	public CeilingFan(String place) {
		this.place = place;
	}
	
	public void on() {
		System.out.println(place + "'s ceiling fan is on!");
	}
	
	public void off() {
		System.out.println(place + "'s ceiling fan is off!");
	}
}
