package com.koresmosto.lozu;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpaceStarterTest {

  private Starter starter;

  @BeforeEach
  void init() {
    starter = new SpaceStarter();
  }

  @Test
  void get() {
    Assertions.assertEquals("Space Starter", starter.get());
  }

  //  @Test
  //  void getNew() {
  //    assertThat(starter.getNew()).isNotNull();
  //    assertThat(starter.getNew()).isNotBlank();
  //  }
}
