package com.koresmosto.lozu;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.UUID;

public class RandomerImpl implements Randomer {
  @Override
  public Object getRandom(@NotNull String randomerType) {
    Random random = new Random();
    switch (randomerType) {
      case "int":
        return random.nextInt();
      case "double":
        return random.nextDouble();
      default:
        return UUID.randomUUID().toString();
    }
  }
}
