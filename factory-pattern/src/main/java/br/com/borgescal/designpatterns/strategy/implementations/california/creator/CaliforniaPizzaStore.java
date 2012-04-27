package br.com.borgescal.designpatterns.strategy.implementations.california.creator;

import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
	public Pizza createPizza(String item) {
		/*
		if (item.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new CaliforniaStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new CaliforniaStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else {
			return null;
		}*/
		return null;
	}
}
