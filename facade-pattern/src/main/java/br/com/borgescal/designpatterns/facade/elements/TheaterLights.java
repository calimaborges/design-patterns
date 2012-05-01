package br.com.borgescal.designpatterns.facade.elements;

public class TheaterLights {

	public void dim(int i) {
		System.out.println("Lights dimmed by " + i + ".");
	}

	public void on() {
		System.out.println("Lights on.");
	}

}
