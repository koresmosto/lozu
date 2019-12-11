package com.koresmosto.lozu;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpaceStarterTest {

  private Starter starter;

  @BeforeEach
  public void init() {
    starter = new SpaceStarter();
  }

  @Test
  public void get() {
    Assertions.assertEquals("Space Starter", starter.get());
  }

  @Test
  public void getNew() {
    assertThat(starter.getNew()).isNotNull();
    assertThat(starter.getNew()).isNotBlank();
  }

  @Test
  public void getRandom() {
    assertThat(starter.getRandom(null)).isNull();
  }
}
