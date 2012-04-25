package br.com.borgescal.designpatterns.strategy.ducks;

import br.com.borgescal.designpatterns.strategy.behaviors.implementations.fly.FlyNoWay;
import br.com.borgescal.designpatterns.strategy.behaviors.implementations.quack.Quack;

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
