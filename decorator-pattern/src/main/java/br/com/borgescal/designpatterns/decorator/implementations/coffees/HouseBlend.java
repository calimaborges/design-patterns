package br.com.borgescal.designpatterns.decorator.implementations.coffees;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .89;
	}
}
