package br.com.borgescal.designpatterns.strategy.implementations.newyork.creator;

import br.com.borgescal.designpatterns.strategy.implementations.newyork.products.NYStyleCheesePizza;
import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} /*else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		}*/ else {
			return null;
		}
	}
}
