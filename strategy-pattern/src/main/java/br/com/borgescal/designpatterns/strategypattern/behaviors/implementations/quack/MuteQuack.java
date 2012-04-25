package br.com.borgescal.designpatterns.strategypattern.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategypattern.behaviors.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
