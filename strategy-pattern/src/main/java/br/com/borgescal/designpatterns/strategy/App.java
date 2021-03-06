package br.com.borgescal.designpatterns.strategy;

import br.com.borgescal.designpatterns.strategy.behaviors.implementations.fly.FlyRocketPowered;
import br.com.borgescal.designpatterns.strategy.ducks.Duck;
import br.com.borgescal.designpatterns.strategy.ducks.MallardDuck;
import br.com.borgescal.designpatterns.strategy.ducks.ModelDuck;

/**
 * Strategy Pattern
 * ================
 * 
 * **The Strategy Pattern** defines a family of algorithms, encapsulates
 * each one, and makes them interchangeable. Strategy lets the algorithm 
 * vary independently from clients that use it. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
