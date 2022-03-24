package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Silambu2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver s = new ChromeDriver();
		s.get("https://www.facebook.com/login/");
	    s.manage().window().maximize();
	    WebElement usertext = s.findElement(By.name("email"));
	    usertext.sendKeys("silambu");
	    WebElement userpass = s.findElement(By.name("pass"));
	    userpass.sendKeys("27638");
	    WebElement login = s.findElement(By.name("login"));
	    login.click();
	    WebElement t=s.findElement(By.xpath("//h2[contains(text(),'F')]"));
	    String text = t.getText();
	    System.out.println(text);
	    
	   
	    
	}

}
