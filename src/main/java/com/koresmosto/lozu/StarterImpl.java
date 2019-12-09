package com.koresmosto.lozu;

public class StarterImpl implements Starter {

    public String get() {
        return "Starter";
    }

    public static void main(String[] args) {
        Starter starter = new StarterImpl();
        System.out.println("Welcome " + starter.get());
    }
}
