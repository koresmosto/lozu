package com.koresmosto.lozu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StarterImplTest {

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
    }
}