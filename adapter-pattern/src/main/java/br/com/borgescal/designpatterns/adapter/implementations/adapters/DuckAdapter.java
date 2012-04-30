package br.com.borgescal.designpatterns.adapter.implementations.adapters;

import br.com.borgescal.designpatterns.adapter.interfaces.Duck;
import br.com.borgescal.designpatterns.adapter.interfaces.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
		duck.fly();
		System.out.println("But not that much!");
	}
}
