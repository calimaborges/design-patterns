package br.com.borgescal.designpatterns.decorator;

import br.com.borgescal.designpatterns.decorator.implementations.coffees.DarkRoast;
import br.com.borgescal.designpatterns.decorator.implementations.coffees.Espresso;
import br.com.borgescal.designpatterns.decorator.implementations.coffees.HouseBlend;
import br.com.borgescal.designpatterns.decorator.implementations.condiments.Mocha;
import br.com.borgescal.designpatterns.decorator.implementations.condiments.Soy;
import br.com.borgescal.designpatterns.decorator.implementations.condiments.Whip;
import br.com.borgescal.designpatterns.decorator.interfaces.Beverage;

/**
 * Decorator Pattern
 * ================
 * 
 * **The Decorator Pattern** attaches additional responsibilities to an
 * object dynamically. Decorators provide a flexible alternative to
 * subclassing for extending functionality. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Beverage beverage = new Espresso();
    	System.out.println(beverage.getDescription() + " $" + beverage.cost());
    	
    	Beverage beverage2 = new DarkRoast();
    	beverage2 = new Mocha(beverage2);
    	beverage2 = new Mocha(beverage2);
    	beverage2 = new Whip(beverage2);
    	System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    	
    	Beverage beverage3 = new HouseBlend();
    	beverage3 = new Soy(beverage3);
    	beverage3 = new Mocha(beverage3);
    	beverage3 = new Whip(beverage3);
    	System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
