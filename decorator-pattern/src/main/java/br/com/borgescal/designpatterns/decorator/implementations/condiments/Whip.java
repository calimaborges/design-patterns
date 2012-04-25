package br.com.borgescal.designpatterns.decorator.implementations.condiments;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;
import br.com.borgescal.designpatterns.decorator.interfaces.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
