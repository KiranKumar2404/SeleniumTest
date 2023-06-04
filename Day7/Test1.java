package com.testng.Demoprog;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Test1 {
	WebDriver driver;
  @Test
  public void checkTitle() {
	  String exptitle="Guest Registration Form – User Registration";
	  String actitle=driver.getTitle();
      Assert.assertEquals(actitle, exptitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
