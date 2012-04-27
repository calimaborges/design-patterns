package br.com.borgescal.designpatterns.strategy.interfaces;

import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Cheese;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Clams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Dough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Pepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Sauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Veggies;

/**
 * The Product Interface
 * @author Carlos Augusto Lima Borges
 *
 */
public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	protected PizzaIngredientFactory ingredientFactory;
	
	public Pizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
