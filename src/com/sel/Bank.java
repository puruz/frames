package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement userName =driver.findElement(By.name("username"));
		userName.sendKeys("Purusothaman");
		WebElement userPass = driver.findElement(By.id("login_password|input"));
		userPass.sendKeys("Job");
		WebElement loginbtn = driver.findElement(By.className("oj-button-text"));
		loginbtn.click();
		
		
	}

}
