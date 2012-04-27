package br.com.borgescal.designpatterns.strategy.implementations.california.creator;

import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public PizzaIngredientFactory getIngredientFactory() {
		return new CaliforniaPizzaIngredientFactory();
	}

	@Override
	public String getName() {
		return "California";
	}
	
}
