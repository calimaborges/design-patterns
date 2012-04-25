package br.com.borgescal.designpatterns.decorator.implementations.coffees;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}
}
