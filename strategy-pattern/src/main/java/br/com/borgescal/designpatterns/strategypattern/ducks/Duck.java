package br.com.borgescal.designpatterns.strategypattern.ducks;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.FlyBehavior;
import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
