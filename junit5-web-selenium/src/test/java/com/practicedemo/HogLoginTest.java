package com.practicedemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HogLoginTest {
  public static WebDriver driver;
  public static WebDriverWait wait;


  @BeforeAll
  public static void InitLogin() {
    driver = new ChromeDriver();
/**
 * 隐式等待写法
 */
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    /**
     * 显示等待写法
     */
    wait = new WebDriverWait(driver, 5);



  }

  @Test

/**
 * 通过隐式等待进行用例执行
 */
  public void Login() {
    driver.get("https://ceshiren.com/");
    driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();

    driver.findElement(By.id("login-account-name")).clear();
    driver.findElement(By.id("login-account-name")).sendKeys("naruto@gmail.com");

    driver.findElement(By.id("login-account-password")).clear();
    driver.findElement(By.id("login-account-password")).sendKeys("naruto@gmail");

    driver.findElement(By.id("login-button")).click();

  }


  @Test
  public void waitLogin() {

    /**
     方式一：通过定制化匿名内部类的写法进行执行显示等待的用例
     */
    driver.get("https://ceshiren.com/");
    driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();

    WebElement element = wait.until(new ExpectedCondition<WebElement>() {
      public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//span[contains(text(),'登录')]"));
      }

    });
    element.click();

    /**
     方式二： 通过自身提供的Api执行显示等待的用例
     */

    WebElement element1 =
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'登录')]")));
    element1.click();
  }


  @Test
  public void searchTest(){
    driver.get("https://ceshiren.com/");
    driver.findElement(By.cssSelector(".search-dropdown .d-icon-search-"));
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }
}


