package br.com.borgescal.designpatterns.strategy.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategy.behaviors.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
