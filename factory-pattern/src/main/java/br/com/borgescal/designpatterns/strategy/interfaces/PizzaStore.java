package br.com.borgescal.designpatterns.strategy.interfaces;

import br.com.borgescal.designpatterns.strategy.implementations.pizzas.CheesePizza;
import br.com.borgescal.designpatterns.strategy.implementations.pizzas.ClamPizza;
import br.com.borgescal.designpatterns.strategy.implementations.pizzas.PepperoniPizza;
import br.com.borgescal.designpatterns.strategy.implementations.pizzas.VeggiePizza;


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

	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = getIngredientFactory();
		
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName(getName() + " Style Cheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName(getName() + " Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName(getName() + " Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName(getName() + " Style Pepperoni Pizza");
		}
		
		return pizza;
	}
	
	public abstract PizzaIngredientFactory getIngredientFactory();
	public abstract String getName();
}
