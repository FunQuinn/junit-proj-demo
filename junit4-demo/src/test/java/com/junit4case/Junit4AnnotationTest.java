package com.junit4.junit4case;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4AnnotationTest {

  @BeforeClass
  public static void before0() {
    System.out.println("@beforeClass");
  }

  @Before
  public void before1() {
    System.out.println("@Before");
  }

  @Test
  public void test0() {
    System.out.println("@Test");
  }

  @Test
  public void test1() {
    System.out.println("@Test1");
  }


  @Test
  public void test2() {
    System.out.println("@Test3");
  }

  @After
  public void after1() {
    System.out.println("@after");

  }

  @AfterClass
  public static void after2() {
    System.out.println("@afterClass");
  }

}
