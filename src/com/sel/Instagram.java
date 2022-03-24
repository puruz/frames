package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("mr_puruz_");
		WebElement userPass=driver.findElement(By.name("password"));
		userPass.sendKeys("750282828");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		loginBtn.click();
		Thread.sleep(4000);
		WebElement dpclick =driver.findElement(By.xpath("//img[@alt='Instagram']"));
		dpclick.click();
		Thread.sleep(3000);
		WebElement txtclick =driver.findElement(By.xpath("//button[text()='Not Now']"));
		txtclick.click();
		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		WebElement searchid =driver.findElement(By.xpath("//input[@aria-label='Search Input']"));
		searchid.sendKeys("narendramodi");
		Thread.sleep(2000);
		WebElement inputid = driver.findElement(By.xpath("//div[text()='narendramodi']"));
		inputid.click();
		Thread.sleep(4000);
		WebElement message = driver.findElement(By.xpath("//div[text()='Message']"));
		message.click();
		Thread.sleep(2000);
		WebElement msgtext = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Message')]"));
		msgtext.sendKeys("hi ji");
		WebElement sent = driver.findElement(By.xpath("//button[text()='Send']"));
		sent.click();
	}

}
