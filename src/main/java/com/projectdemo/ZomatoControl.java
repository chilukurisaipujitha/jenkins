package com.projectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZomatoControl {
	public static String browser="firefox";
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		}
		    driver.get("https://www.ebay.com/");
		    driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div/div/div/section/ul/li[3]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div/div/div/section/ul/li[5]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[3]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[3]/section/ul/li[2]/div[1]/div[2]/a/h3")).click();
		    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[4]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span")).click();
    }
    

}
