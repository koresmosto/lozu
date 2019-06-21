package com.koresmosto.lozu;

import java.util.List;

public class StarterImpl implements Starter {

  private Randomer randomer = new RandomerImpl();

  public String get() {
    return "Starter";
  }

  public String getNew() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  public Object getRandom(String randomerType) {

      return randomer
              .getRandom(randomerType);
  }

  public static void main(String[] args) {
    Starter starter = new StarterImpl();
    if (args != null) {
      System.out.println("Welcome " + starter.get());
    }
  }
}
