package com.koresmosto.lozu;

import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StarterImplTest {

  private Starter starter;

  @BeforeEach
  void init() {
    starter = new StarterImpl();
  }

  @Test
  void get() {
    Assertions.assertEquals("Starter", starter.get());
  }

  @Test
  void getNegative() {
    Assertions.assertNotEquals("starter", starter.get());
    Assertions.assertNotEquals("STARTER", starter.get());
  }

  @Test
  void mainCheckingForCoverage() {
    Assertions.assertDoesNotThrow(() -> StarterImpl.main(null));
  }

  @Test
  void mainCheckingForCoverageWithNotNull() {
    Assertions.assertDoesNotThrow(() -> StarterImpl.main(new String[] {"Any param value"}));
  }

  @Test
  void getNow() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> starter.getNew());
  }

  @Test
  void getRandom() {
    Assertions.assertNotNull(starter.getRandom("int"));
    Assertions.assertNotNull(starter.getRandom("double"));
    Assertions.assertNotNull(starter.getRandom("float"));
    Assertions.assertNotNull(starter.getRandom("boolean"));
    Assertions.assertThrows(NullPointerException.class, () -> starter.getRandom(null));
  }

  @Test
  void getRandomException() {
    Assertions.assertThrows(NullPointerException.class, () -> starter.getRandom(((Supplier<String>) () -> null).get()));
  }
}
