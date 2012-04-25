package br.com.borgescal.designpatterns.strategy.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategy.behaviors.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
