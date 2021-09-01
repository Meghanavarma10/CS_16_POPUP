package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup_2 {
	@Test
	public  void main ()throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana\\Desktop\\selenium software\\chromedriver.exe");
		
		//Open Browser
		WebDriver driver = new ChromeDriver();

		//Launch the URL --> popup2.html
		driver.get("C:/Users/Meghana/Documents/popup1.html");
		
		//Get Text on the pop up window
		WebElement btn=driver.findElement(By.xpath("/html/body/button"));
		btn.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//Accept / Dismiss pop up
		Thread.sleep(3000);
		alert.accept();
		
		//Get the confirmation message based on accept / dismiss
		
		
		/*Verify whether it is an accept / dismiss alert, based on the
		 confirmation message & print in console.*/ 
		
	}

}
