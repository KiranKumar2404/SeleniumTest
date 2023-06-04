package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day5Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		String purl=driver.getCurrentUrl();
		if(purl.equals("https://j2store.net/free/"))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
        String curl=driver.getCurrentUrl();
		if(curl.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
