package br.com.borgescal.designpatterns.observerpattern.implementations;

import java.util.Observable;
import java.util.Observer;

import br.com.borgescal.designpatterns.observerpattern.interfaces.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;
	private float currentPressure = 29.9f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Last pressure: " + this.lastPressure);
		System.out.println("Current pressure: " + this.currentPressure);
	}

	public void update(Observable observable, Object obj) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

}
