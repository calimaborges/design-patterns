package br.com.borgescal.designpatterns.facade.elements;

public class Amplifier {

	public void on() {
		System.out.println("Amplifier on.");		
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Amplifier setting DVD");
	}

	public void setSurroundSound() {
		System.out.println("Amplifier setting surround sound.");
	}

	public void setVolume(int i) {
		System.out.println("Setting volume to " + i + ".");		
	}

	public void off() {
		System.out.println("Amplifier off.");
	}

}
