package br.com.borgescal.designpatterns.strategy.implementations.newyork.creator;

import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public PizzaIngredientFactory getIngredientFactory() {
		return new NYPizzaIngredientFactory();
	}

	@Override
	public String getName() {
		return "New York";
	}

}
