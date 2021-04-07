package com.practicedemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesterWebTest {
  public static WebDriver webDriver;

  @BeforeAll
  public static void initData() {
    webDriver = new ChromeDriver();
    webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // 等待5秒加载完成
  }

  @Test
  public void login() {

    webDriver.get("https://www.baidu.com/");
    webDriver.findElement(By.xpath("//a[@name='tj_login']")).click();




//    webDriver.findElement(By.id("TANGRAM__PSP_11__userName")).clear();
    webDriver.findElement(By.id("TANGRAM__PSP_11__userName")).sendKeys("18709109306");

//    webDriver.findElement(By.id("TANGRAM__PSP_11__passwordWrapper")).clear();
    webDriver.findElement(By.id("TANGRAM__PSP_11__passwordWrapper")).sendKeys("***123");

    webDriver.findElement(By.id("TANGRAM__PSP_11__submit")).click();




  }

}
