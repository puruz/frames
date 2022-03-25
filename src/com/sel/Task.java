package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;

public class Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement username = d.findElement(By.name("email"));
		username.sendKeys("purusoth");
		WebElement userpass = d.findElement(By.name("pass"));
		userpass.sendKeys("7636833");
		Actions k = new Actions(d);
		Thread.sleep(3000);
		//WebElement forget = d.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//k.moveToElement(forget).perform();
		//WebElement login =d.findElement(By.xpath("//button[text()='Log In']"));
		//login.click();
		//WebElement Ftext =d.findElement(By.xpath("(//a[contains(text(),'For')])[2]"));
		//String g = Ftext.getText();
		//System.out.println(g);
		WebElement text =d.findElement(By.xpath("//span[text()=' Meta © 2022']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true)", text);
		//TakesScreenshot tk = (TakesScreenshot)d;
		//File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//File dest = new File ("C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\ScreenShot\\fb.png");
		//FileUtils.copyFile(screenshotAs, dest);
		
		//d.quit();
		

		
		
		
		
		
	}

}
