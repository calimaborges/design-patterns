package br.com.borgescal.designpatterns.adapter.implementations.adapters;

import br.com.borgescal.designpatterns.adapter.interfaces.Duck;
import br.com.borgescal.designpatterns.adapter.interfaces.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
