package br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.fly;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying!");
	}

}
