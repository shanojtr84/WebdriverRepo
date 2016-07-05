package com.git.WebdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmailTest {

	
	
	@Test
	public void gmailLaunch(){
		

        WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.google.com");
		//driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		//driver.navigate().back();
		//driver.navigate().forward();
		
		
		
	}
}
