package br.com.borgescal.designpatterns.strategy.implementations.newyork.creator;

import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.cheese.ReggianoCheese;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.clams.FreshClams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.dough.ThinCrustDough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.pepperoni.SlicedPepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.sauce.MarinaraSauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.Garlic;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.Mushroom;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.Onion;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.RedPepper;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Cheese;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Clams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Dough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Pepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Sauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Veggies;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies [] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}

}
