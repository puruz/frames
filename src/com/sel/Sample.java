package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		String curl = driver.getCurrentUrl(); 
		System.out.println(curl);
		boolean v = curl.equals(url);
		System.out.println(v);
		if(v==true)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
			
		}
		driver.quit();
		
	}
}
