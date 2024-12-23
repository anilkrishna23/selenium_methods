package Getmethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class particemethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.get("https://testautomationpractice.blogspot.com");
		System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	   
	    String window= driver.getWindowHandle();
	    System.out.println(window);
	    
	  //  driver.findElement(By.linkText("Blogger")).click();
	   // Set<String> windows=driver.getWindowHandles();
	   // System.out.println(windows);
	
	     boolean statu= driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();
	     System.out.println(statu);
	     
	     boolean ll=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).isEnabled();
	     System.out.println(ll);
	     
	    
	    WebElement male= driver.findElement(By.xpath("//input[@id='male']"));
	    System.out.println(male.isSelected());
	    male.click();
	    System.out.println(male.isSelected());
	  
	   /* List<WebElement> links= driver.findElements(By.tagName("a"));
	   
		 System.out.println(links.size());
	    for(WebElement element:links)
	    {
	    
	    	 System.out.println(element.getText());
	    }
	   */
	    
	    
	    WebElement tables=driver.findElement(By.name("BookTable"));
	    List<WebElement> row= tables.findElements(By.tagName("tr"));
	    int rowcount=row.size();
	    System.out.println(rowcount);
	    
	    for(WebElement p :row)
	    {
	    	System.out.println(p.getText());
	    }
	    
	    List<WebElement > cols=tables.findElements(By.tagName("th"));
	    int colscount=cols.size();
	    System.out.println(colscount);
	    
	    for(WebElement element:cols)
	    {
	    	System.out.println(element.getText());
	    }
	
	
	}

}
