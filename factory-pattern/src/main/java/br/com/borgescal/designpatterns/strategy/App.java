package br.com.borgescal.designpatterns.strategy;

import br.com.borgescal.designpatterns.strategy.implementations.california.creator.CaliforniaPizzaStore;
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
 *
 * Abstract Factory Pattern
 * ========================
 * 
 * **The Abstract Factory Pattern** provides an interface for creating families
 * of related or dependent objects without specifying their concrete classes.
 */
public class App 
{
    public static void main( String[] args )
    {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Igor ordered a " + pizza.getName() + "\n");
        
        pizza = californiaPizzaStore.orderPizza("pepperoni");
        System.out.println("Peter ordered a " + pizza.getName() + "\n");
    }
}
