package com.junit5assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 使用AssertEquals对加减乘除、计数进行断言
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalSciprtAssert {

  @Test
  @Order(1)
  public void addTest() throws InterruptedException {
    int add_result = Calculator.add(5, 3);
    System.out.println(add_result);
    assertEquals(8, add_result);
  }

  @Test
  @Order(2)
  public void subTractTest() throws InterruptedException {
    int sub_result = Calculator.subtract(5, 3);
    System.out.println(sub_result);
    assertEquals(8, sub_result);
  }

  @Test
  @Order(3)
  public void multiplyTest() {
    int mul_result = Calculator.multiply(5, 6);
    System.out.println(mul_result);
    assertEquals(30, mul_result);
  }

  @Test
  @Order(4)
  public void devideTest() {
    int devide_result = Calculator.devide(10, 2);
    System.out.println(devide_result);
    assertEquals(5, devide_result);
  }

  @BeforeEach
  public void clear() {
    Calculator.clear();
  }

  @Test
  @Order(5)
  public void countTest() throws InterruptedException {
    int count_result = Calculator.count(1);
    count_result = Calculator.count(2);
    System.out.println(count_result);
    assertEquals(3, count_result);
  }


}
