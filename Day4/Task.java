package com.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
	    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		//driver.navigate().to("https://www.facebook.com");
		driver.navigate().refresh();  
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.cssSelector("input#input-firstname"));
		fname.sendKeys("Darsani");
		WebElement lname=driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		lname.sendKeys("K");
		WebElement email=driver.findElement(By.cssSelector("input.form-control[placeholder=\"E-Mail\"]"));
		email.sendKeys("darsani@gmail.com");
        WebElement passw=driver.findElement(By.xpath("//input[@name=\"password\"]"));
        passw.sendKeys("dars0411@");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"input-newsletter-yes\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
        //driver.findElement(By.partialLinkText("Forgotten")).click();
        //driver.findElement(By.linkText("Forgotten Password")).click();

	}

}
