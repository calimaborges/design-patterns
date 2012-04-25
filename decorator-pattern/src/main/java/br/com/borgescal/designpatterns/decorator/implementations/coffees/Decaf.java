package br.com.borgescal.designpatterns.decorator.implementations.coffees;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
	
	public double cost() {
		return 1.05;
	}
}
