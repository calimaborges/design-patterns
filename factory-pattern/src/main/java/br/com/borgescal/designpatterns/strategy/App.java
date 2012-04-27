package br.com.borgescal.designpatterns.strategy;

import br.com.borgescal.designpatterns.strategy.implementations.chicago.creator.ChicagoPizzaStore;
import br.com.borgescal.designpatterns.strategy.implementations.newyork.creator.NYPizzaStore;
import br.com.borgescal.designpatterns.strategy.interfaces.Pizza;
import br.com.borgescal.designpatterns.strategy.interfaces.PizzaStore;

/**
 * Factory Method Pattern
 * ======================
 * 
 * **The Factory Method Pattern** defines an interface for creating an object, 
 * but lets subclasses decide which class to instantiate. Factory Method lets a 
 * class defer instantiation to subclasses.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
