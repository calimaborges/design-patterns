package br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
