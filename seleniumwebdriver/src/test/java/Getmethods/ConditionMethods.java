package Getmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.nopcommerce.com/register");
		//is displayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:"+logo.isDisplayed());
	
	
        //is enabled
		boolean ena=driver.findElement(By.id("FirstName")).isEnabled();
	    System.out.println(ena);
	
	    //isselected
	    WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
	    
	    System.out.println("before slection.......");
	    System.out.println(male.isSelected());
	    System.out.println(female.isSelected());
	    
	    System.out.println("after selection.....");
	    male.click();
	    System.out.println(male.isSelected());
	    
	    
	    driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	
	
	
	
	}

}
