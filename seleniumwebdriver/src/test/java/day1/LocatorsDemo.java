package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opencart.com");
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
		// boolean logos =driver.findElement(By.id("logo")).isDisplayed();
		 //System.out.println(logos);
		
		//linkText and partialLinkText
		
		//driver.findElement(By.linkText("Laptops & Notebooks")).click();
        //  driver.findElement(By.partialLinkText("Table")).click();
	    
		
		//class
		
		// List<WebElement> headerlinks= driver.findElements(By.className("list-inline-item"));
		 
		 //System.out.println("total no of header links:"+ headerlinks.size());
	
		//tagNmae
		
	//	List<WebElement> links= driver.findElements(By.tagName("a"));
	//	System.out.println("total no of links:"+ links.size());
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		
		
	
	
	}

}
