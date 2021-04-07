package com.company;

public class Main {

    public static void main(String[] args) {


        Context context = new Context(new FastestWay());
        context.doNavigate();
        System.out.println("-------------------------------");
        context = new Context(new ShortestWay());
        context.doNavigate();


    }
}
