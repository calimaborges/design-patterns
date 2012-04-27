package br.com.borgescal.designpatterns.strategy.implementations.california.creator;

import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.cheese.Mozzarella;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.clams.FrozenClams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.dough.ThickCrustDough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.pepperoni.SlicedPepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.sauce.MarinaraSauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.BlackOlives;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.EggPlant;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.implementations.veggies.Garlic;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Cheese;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Clams;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Dough;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Pepperoni;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Sauce;
import br.com.borgescal.designpatterns.strategy.implementations.ingredients.interfaces.Veggies;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaIngredientFactory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(), new EggPlant(), new Garlic() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}

}
