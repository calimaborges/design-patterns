package br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.fly;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly!");
	}
}
