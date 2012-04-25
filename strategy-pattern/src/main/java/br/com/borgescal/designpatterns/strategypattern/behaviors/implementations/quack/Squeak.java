package br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
