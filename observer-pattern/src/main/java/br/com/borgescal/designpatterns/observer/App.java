package br.com.borgescal.designpatterns.observer;

import br.com.borgescal.designpatterns.observer.implementations.CurrentConditionDisplay;
import br.com.borgescal.designpatterns.observer.implementations.ForecastDisplay;
import br.com.borgescal.designpatterns.observer.implementations.HeatIndexDisplay;
import br.com.borgescal.designpatterns.observer.implementations.WeatherData;

/**
 * Observer Pattern
 * ================
 * 
 * **The Observer Pattern** defines a one-to-many dependency between
 * objects so that when one object changes state, all of its dependents
 * are notified and updated automatically. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WeatherData weatherData = new WeatherData();
    	
    	CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
    	HeatIndexDisplay hiDisplay = new HeatIndexDisplay(weatherData);
    	ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    	
    	weatherData.setMeasurements(80, 65, 30.4f);
    	weatherData.setMeasurements(82, 70, 29.2f);
    	weatherData.setMeasurements(78, 90, 29.2f);
    }
}
