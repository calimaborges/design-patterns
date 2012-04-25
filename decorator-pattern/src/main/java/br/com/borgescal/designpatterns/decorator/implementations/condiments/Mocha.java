package br.com.borgescal.designpatterns.decorator.implementations.condiments;

import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;
import br.com.borgescal.designpatterns.decorator.interfaces.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
