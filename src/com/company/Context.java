package com.company;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doNavigate (){
        System.out.println(strategy.toNavigate());
    }
}
