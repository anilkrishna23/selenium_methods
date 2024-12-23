package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		//driver.get("https://amazon.in");
		
		//tag id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobiles");
         // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("moblies"); 
	
		//tagclass tag.classname
		
		//driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("mac");
		//driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("mac");
	
		//tag attribute  tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("mac");
		//driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("mac");
		//driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("mac");
		
		//tag class attribute     tag.classname[attribute ="value"]
		
		//driver.findElement(By.cssSelector("input.Pke_EE[name=\"q\"]")).sendKeys("earbuds");
		//driver.findElement(By.cssSelector(".Pke_EE[name='q']")).sendKeys("earbuds");
		
	driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("toys");
	 
	
	
	
	
	
	
	
	
	}

}
  