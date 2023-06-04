package com.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		WebElement rfname=driver.findElement(By.xpath("//input[@name=\"to_name\"]"));
		rfname.sendKeys("Kiran");
		WebElement remail=driver.findElement(By.xpath("//input[@name=\"to_email\"]"));
		remail.sendKeys("kiran@gmail.com");
		WebElement fname=driver.findElement(By.xpath("//input[@name=\"from_name\"]"));
		fname.sendKeys("Darsani");
		WebElement email=driver.findElement(By.xpath("//input[@name=\"from_email\"]"));
		email.sendKeys("darsani@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"voucher_theme_id\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
	}

}
