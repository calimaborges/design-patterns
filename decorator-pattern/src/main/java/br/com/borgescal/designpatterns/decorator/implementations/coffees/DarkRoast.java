package br.com.borgescal.designpatterns.decorator.implementations.coffees;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	public double cost() {
		return .99;
	}
}
