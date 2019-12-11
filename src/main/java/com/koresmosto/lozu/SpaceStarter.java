package com.koresmosto.lozu;

import java.util.Random;

public class SpaceStarter implements Starter {

  private static final Random rand = new Random();

  @Override
  public String get() {
    return "Space Starter";
  }

  @Override
  public String getNew() {
    return rand.doubles()
        .limit(5)
        .mapToObj(d -> String.valueOf(d))
        .reduce("", (d1, d2) -> d1 + ":" + d2);
  }

  @Override
  public Object getRandom(String randomType) {
    return null;
  }
}
