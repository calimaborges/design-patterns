package br.com.borgescal.designpatterns.observerpattern.implementations;

import java.util.Observable;
import java.util.Observer;

import br.com.borgescal.designpatterns.observerpattern.interfaces.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
		
	}
}

