package br.com.borgescal.designpatterns.template;

import br.com.borgescal.designpatterns.template.implementations.Coffee;
import br.com.borgescal.designpatterns.template.implementations.Tea;

/**
 * Template Method Pattern
 * =======================
 * 
 * **The Template Method Pattern** defines the skeleton of an algorithm in a method, deferring some
 * steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without
 * changing the algorithm's structure. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Tea tea = new Tea();
    	tea.prepareRecipe();
    	
    	Coffee coffee = new Coffee();
    	coffee.prepareRecipe();
    }
}

