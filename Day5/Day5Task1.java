package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day5Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		String title=driver.getTitle();
        if (title.equals("Home"))
        	System.out.println(title);
        else
        	System.out.println("not a Home");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
        String title1=driver.getTitle();
        if (title1.equals("Shop"))
        	System.out.println(title1);
        else
        	System.out.println("Not a Shop");
	}

}
