package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Returns")).click();
		driver.navigate().to("https://demo.opencart.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gift Certificates")).click();
		//driver.navigate().back();
	}

}
