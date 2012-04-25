package br.com.borgescal.designpatterns.strategy.ducks;

import br.com.borgescal.designpatterns.strategy.behaviors.implementations.fly.FlyWithWings;
import br.com.borgescal.designpatterns.strategy.behaviors.implementations.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck.");
	}

}
