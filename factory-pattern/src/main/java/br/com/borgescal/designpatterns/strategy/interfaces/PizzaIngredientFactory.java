package br.com.borgescal.designpatterns.strategy.interfaces;

import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Cheese;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Clams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Dough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Pepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Sauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
