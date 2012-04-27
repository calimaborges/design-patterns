package br.com.borgescal.designpatterns.strategy.implementations.chicago.creator;

import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public PizzaIngredientFactory getIngredientFactory() {
		return new ChicagoPizzaIngredientFactory();
	}

	@Override
	public String getName() {
		return "Chicago";
	}
	
}
