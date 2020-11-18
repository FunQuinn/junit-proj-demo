package com.junit5case;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5AnnitationChildTest extends Junit5AnnotationTest {


  @Test
  void fun_testChild() {
    System.out.println("@testChild funnnn");
  }

  @Test
  void testfunChild() {
    System.out.println("@testChild funn");
  }

  @BeforeAll
  public static void beforeChild() {
    System.out.println("@beforeChild fun");
  }

  @AfterAll
  public static void afterChild() {
    System.out.println("@afterChild fun");
  }

  @BeforeEach
  void before_each_Child() {
    System.out.println("@beforeChild Each");
  }

  @AfterEach
  void after_each_Child() {
    System.out.println("@afterChild Each");
  }


}



