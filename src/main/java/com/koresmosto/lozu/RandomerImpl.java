package com.koresmosto.lozu;

import java.util.Random;
import java.util.UUID;

public class RandomerImpl implements Randomer {
  @Override
  public Object getRandom(String randomerType) {
    Random random = new Random();
    switch (randomerType) {
      case "int":
        return random.nextInt();
      case "double":
        return random.nextDouble();
      case "boolean":
        return random.nextBoolean();
      default:
        return UUID.randomUUID().toString();
    }
  }
}
