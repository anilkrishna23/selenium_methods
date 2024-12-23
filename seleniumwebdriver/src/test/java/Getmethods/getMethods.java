package Getmethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    driver.get("https://opensource-demo.orangehrmlive.com"); 
     
    //getTitle() - returns title of the page

    String pg=driver.getTitle();
     
	System.out.println(pg);
	
	//getCurrentUrl() - retuns URL of the page

	System.out.println(driver.getCurrentUrl());
	
	//getPageSource()- returns source code of the page

	//System.out.println(driver.getPageSource());
	
	//getWindowHandle() - returns ID of the single Browser window

	String window=driver.getWindowHandle();
	System.out.println(window);
	
	//getWindowHandles() - retuns ID's of the multiple browser windows

	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> windowids=driver.getWindowHandles();
	System.out.println(windowids);
	
	
	
	}

}
