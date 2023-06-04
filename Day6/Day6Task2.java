package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day6Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.sendKeys("Darsani");
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.sendKeys("K");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		email.sendKeys("darsani@gmail.com");
        WebElement passw=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
        passw.sendKeys("dars0411@");
        WebElement dob=driver.findElement(By.xpath("//*[@id=\"load_flatpickr\"]"));
        dob.sendKeys("4/11/2003");
        WebElement nat=driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]"));
        nat.sendKeys("Indian");
        WebElement phone=driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]"));
        phone.sendKeys("9955443310");
        WebElement emecon=driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]"));
        emecon.sendKeys("9047090899");
        WebElement doa=driver.findElement(By.xpath("//*[@id=\"load_flatpickr\"]"));
        doa.sendKeys("14/4/23");
        WebElement lenofs=driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]"));
        lenofs.sendKeys("10");
        WebElement room=driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]"));
        room.sendKeys("203/4");
        WebElement occp=driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]"));
        occp.sendKeys("Tester");
	}

}
