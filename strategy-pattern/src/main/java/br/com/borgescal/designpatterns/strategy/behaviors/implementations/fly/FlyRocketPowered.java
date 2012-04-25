package br.com.borgescal.designpatterns.strategy.behaviors.implementations.fly;

import br.com.borgescal.designpatterns.strategy.behaviors.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
