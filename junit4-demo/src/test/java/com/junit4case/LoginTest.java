package com.junit4case;

import org.junit.Test;

public class LoginTest extends BaseTest {

  @Test
  public void login(){
    dataMap.put("login","login secuess");
    System.out.println(dataMap.get("login"));
  }


}
