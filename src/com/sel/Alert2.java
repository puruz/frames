package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe" );
		WebDriver D = new ChromeDriver();
		D.get("https://demo.guru99.com/test/delete_customer.php");
		D.manage().window().maximize();
		WebElement h = D.findElement(By.name("cusid"));
		h.sendKeys("223344");
		WebElement k = D.findElement(By.name("submit"));
		k.click();
		
		Alert al = D.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(3000);
		al.accept();
		
		Alert ak = D.switchTo().alert();
		String ak2 = ak.getText();
		System.out.println(ak2);
		Thread.sleep(4000);
		ak.accept();
		
		
		
	}

}
