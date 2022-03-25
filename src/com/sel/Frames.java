package com.sel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		d.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert text = d.switchTo().alert();
		String text2 = text.getText();
		System.out.println(text2);
		Thread.sleep(2000);
		d.switchTo().alert().sendKeys("purusoth");
		Thread.sleep(5000);
		text.accept();
		
		WebElement k = d.findElement(By.xpath("//span[text()='purusoth']"));
		String l=k.getText();
		System.out.println(l);
		
	
		
		
		
	}

}
