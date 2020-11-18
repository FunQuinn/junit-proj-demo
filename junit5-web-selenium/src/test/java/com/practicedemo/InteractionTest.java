package com.practicedemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class InteractionTest {
  public static WebDriver driver;


  @BeforeAll
  public static void InitLogin() {
    driver = new ChromeDriver();

//    driver =new FirefoxDriver();

/**
 * 隐式等待写法
 */
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }

  @Test

/**
 * 通过隐式等待执行点击，右键，双击操作
 */
  public void ActionLogin() {
    try {
      driver.get("http://sahitest.com/demo/clicks.htm");
      Actions actions = new Actions(driver);
      actions.click(driver.findElement(By.xpath("//Input[@value='click me']")));
      actions.click(driver.findElement(By.xpath("//Input[@value='dbl click me']")));
      actions.click(driver.findElement(By.xpath("//Input[@value='right click me']")));
      actions.perform();
      Thread.sleep(5000);


    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }


  @Test

  public void moveOnTest() {
    try {
      driver.get("https://www.baidu.com");
      Actions actions = new Actions(driver);
      actions.moveToElement(driver.findElement(By.id("s-usersetting-top")))
      ;
      actions.perform();
    } catch (Exception e) {
      e.printStackTrace();
    }


  }

  @Test
  /**
   * 定位元素，拖动用例
   */
  public void dragTest(){
    driver.get("http://sahitest.com/demo/dragDropMooTools.htm");
    Actions actions=new Actions(driver);
    actions.dragAndDrop(driver.findElement(By.id("dragger")),
        driver.findElement(By.xpath("//*[@class='item'][last()]"))).perform();

  }

  @Test
  public void keyBoardTest(){
    driver.get("http://sahitest.com/demo/label.htm");
    driver.findElements(By.xpath("//input[@type='textbox']")).get(0).sendKeys("ashin");
    Actions actions=new Actions(driver);
    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
    actions.keyDown(driver.findElements(By.xpath("//input[@type='textbox']")).get(1),Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

  }

  @Test
  public void scorllTest() {
    try {
      driver.get("https://www.baidu.com");
      driver.findElement(By.id("kw")).sendKeys("霍格沃兹测试学院");
      Actions actions = new Actions(driver);
      actions.click(driver.findElement(By.id("su")))
      ;

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[@class='n']")).click();
      Thread.sleep(5000);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }




  @AfterAll
  public static void tearDown() {
    driver.quit();
  }
}


