package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapLocation {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@10.7937792,79.1314432,13z");
		driver.manage().window().maximize();
		WebElement searchplace =driver.findElement(By.name("q"));
		searchplace.sendKeys("pattukottai");
		WebElement click = driver.findElement(By.id("searchbox-searchbutton"));
		click.click();
		Thread.sleep(6000);
		WebElement d =driver.findElement(By.xpath("//img[@alt='Directions']"));
	    d.click();
	    Thread.sleep(5000);
		WebElement s =driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
		s.sendKeys("chennai");
		WebElement e=driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']"));
		e.click();
		
		
		
		

	}
	}
