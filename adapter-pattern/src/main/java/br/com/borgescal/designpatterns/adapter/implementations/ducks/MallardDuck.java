package br.com.borgescal.designpatterns.adapter.implementations.ducks;

import br.com.borgescal.designpatterns.adapter.interfaces.Duck;

public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Quack");
	}
	
	public void fly() {
		System.out.println("I'm flying");
	}
}
