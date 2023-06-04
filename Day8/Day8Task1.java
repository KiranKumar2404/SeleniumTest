package com.testng.Demoprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task1 {
  @Test
  public void DragDrop() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/droppable/");
	  driver.manage().window().maximize();
	  WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  Actions action=new Actions(driver);
	  action.dragAndDrop(source, destination).build().perform();
  }
}
