package br.com.borgescal.designpatterns.command.implementations.receivers;

public class Stereo {
	String place;
	
	public Stereo(String place) {
		this.place = place;
	}
	
	public void on() {
		System.out.println("Stereo is on!");
	}
	
	public void off() {
		System.out.println("Stereo is off!");
	}
	
	public void setCD() {
		System.out.println("Stereo CD is set!");
	}
	
	public void setDVD() {
		System.out.println("Stereo DVD is set!");
	}
	
	public void setRadio() {
		System.out.println("Stereo Radio is set!");
	}
	
	public void setVolume(int value) {
		System.out.println("Stereo volume is " + value + "!");
	}
}
