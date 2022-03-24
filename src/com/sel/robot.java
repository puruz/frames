package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver A = new ChromeDriver();
		A.get("https://www.facebook.com/");
		A.manage().window().maximize(); 
		Thread.sleep(2000);
		WebElement usertext = A.findElement(By.id("email"));
		usertext.sendKeys("purusoth");
		Actions d = new Actions(A);
		d.doubleClick(usertext).contextClick(usertext).build().perform();
		Robot s = new Robot();
		
		for (int i = 0; i < 7; i++) {
			s.keyPress(KeyEvent.VK_DOWN);
			s.keyRelease(KeyEvent.VK_DOWN);
		}
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}

}
