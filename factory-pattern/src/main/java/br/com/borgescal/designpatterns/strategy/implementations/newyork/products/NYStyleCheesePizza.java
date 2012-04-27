package br.com.borgescal.designpatterns.strategy.implementations.newyork.products;

import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}