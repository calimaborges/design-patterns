package br.com.borgescal.designpatterns.strategypattern.ducks;

import br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.fly.FlyNoWay;
import br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
	
	@Override
	public void display() {
        System.out.println("I'm a model duck");
	}

}
