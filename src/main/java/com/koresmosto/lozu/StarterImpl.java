package com.koresmosto.lozu;

public class StarterImpl implements Starter {

  private Randomer randomer = new RandomerImpl();

  /**
   * Standard java main method.
   *
   * @param args standard main method args
   */
  public static void main(String[] args) {
    Starter starter = new StarterImpl();
    if (args != null) {
      System.out.println("Welcome " + starter.get());
    }
  }

  public String get() {
    return "Starter";
  }

  public String getNew() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  public Object getRandom(String randomerType) {

    return randomer.getRandom(randomerType);
  }
}
