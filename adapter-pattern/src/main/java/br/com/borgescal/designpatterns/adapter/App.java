package br.com.borgescal.designpatterns.adapter;

import br.com.borgescal.designpatterns.adapter.implementations.adapters.DuckAdapter;
import br.com.borgescal.designpatterns.adapter.implementations.adapters.TurkeyAdapter;
import br.com.borgescal.designpatterns.adapter.implementations.ducks.MallardDuck;
import br.com.borgescal.designpatterns.adapter.implementations.turkeys.WildTurkey;
import br.com.borgescal.designpatterns.adapter.interfaces.Duck;
import br.com.borgescal.designpatterns.adapter.interfaces.Turkey;

/**
 * Adapter Pattern
 * ===============
 * 
 * **The Adapter Pattern** converts the interface of a class into another interface
 * the clients expect. Adapter lets classes work together that couldn't otherwise 
 * because of incompatible interfaces. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);
        
        System.out.println("The Turkey says...");
        testTurkey(turkey);
        
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        
        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }
    
    static void testDuck(Duck duck) {
    	duck.quack();
    	duck.fly();
    }
    
    static void testTurkey(Turkey turkey) {
    	turkey.gobble();
    	turkey.fly();
    }
}
