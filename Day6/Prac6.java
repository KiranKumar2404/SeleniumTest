package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prac6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.nykaa.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div/div/div/div[1]/div[2]/div")).click();

	}

}
