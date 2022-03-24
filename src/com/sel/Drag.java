package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		Actions k = new Actions (driver);
		k.dragAndDrop(source, target).perform();
		
		WebElement sa = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement ba = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		k.dragAndDrop(sa, ba).perform();
		Thread.sleep(3000);
		
		
		WebElement hj = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement kl = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		k.dragAndDrop(hj, kl).perform();
		
		WebElement dd = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement ss = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		k.dragAndDrop(dd, ss).perform();
		
		
	}

}