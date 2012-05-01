package br.com.borgescal.designpatterns.facade.elements;

public class DvdPlayer {

	public void on() {
		System.out.println("DVD on.");		
	}

	public void play(String movie) {
		System.out.println("Playing movie " + movie + ".");
	}

	public void stop() {
		System.out.println("DVD stopped.");
	}

	public void eject() {
		System.out.println("DVD ejected.");		
	}

	public void off() {
		System.out.println("DVD off.");		
	}

}
