package br.com.borgescal.designpatterns.template.interfaces;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public boolean customerWantsCondiments() {
		return true;
	}
}
