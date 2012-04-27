package br.com.borgescal.designpatterns.strategy.implementations.chicago.creator;

import br.com.borgescal.designpatterns.strategy.implementations.chicago.products.ChicagoStyleCheesePizza;
import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}/* else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} */ else {
			return null;
		}
	}
}
