package com.testng.Demoprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Tak2 {
  @Test
  public void Task2() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement srce=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement dest=driver.findElement(By.id("droppable"));
	  Actions action=new Actions(driver);
	  action.dragAndDrop(srce, dest).build().perform();
	  
  }
}
