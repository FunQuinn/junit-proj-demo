package com.junit5assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EveTest {
  @Test
  public  void envTest(){
    assertEquals(1,3,"实际值与期望值不一致");
  }
}
