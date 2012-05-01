package br.com.borgescal.designpatterns.template.implementations;

import br.com.borgescal.designpatterns.template.interfaces.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
