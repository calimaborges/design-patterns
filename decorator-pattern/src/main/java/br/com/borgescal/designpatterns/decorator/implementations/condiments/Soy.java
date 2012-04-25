package br.com.borgescal.designpatterns.decorator.implementations.condiments;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;
import br.com.borgescal.designpatterns.decorator.interfaces.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}

