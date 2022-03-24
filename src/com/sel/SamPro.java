package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamPro {
	public static void main(String[]args) {
		System.setProperty("webderiver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement userTxt = driver.findElement(By.id("email"));
		String att = userTxt.getAttribute("placeholder");
		System.out.println(att);
		
		
	}

}
