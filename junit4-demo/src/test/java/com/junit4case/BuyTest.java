package com.junit4case;

import org.junit.Test;

public class BuyTest extends BaseTest {
  @Test
  public void buy(){
    if (dataMap.get("login").equals("login secuess")){
      System.out.println("登入成功，开始购买");
    }else{
      System.out.println("先登入再操作");
    }
  }
}
