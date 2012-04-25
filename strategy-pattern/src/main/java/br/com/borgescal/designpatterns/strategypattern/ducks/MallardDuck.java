package br.com.borgescal.designpatterns.strategypattern.ducks;

import br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.fly.FlyWithWings;
import br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.quack.Quack;

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
