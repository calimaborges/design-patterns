package br.com.borgescal.designpatterns.strategy.behaviors.implementations.quack;

import br.com.borgescal.designpatterns.strategy.behaviors.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
