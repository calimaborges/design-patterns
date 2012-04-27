package br.com.borgescal.designpatterns.strategy.interfaces;

/**
 * The Creator Interface
 * @author Carlos Augusto Lima Borges
 *
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
