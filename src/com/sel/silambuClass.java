package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class silambuClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
	WebDriver s = new ChromeDriver();
	s.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement userName=s.findElement(By.name("email"));
	userName.sendKeys("puru");
	WebElement userpass=s.findElement(By.xpath("//input[@type='password']"));
	userpass.sendKeys("27278");
	WebElement login=s.findElement(By.xpath("//button[@value='1']"));
	login.click();
	
	
}
}
