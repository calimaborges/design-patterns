package br.com.borgescal.designpatterns.strategy.implementations.pizzas;

import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
