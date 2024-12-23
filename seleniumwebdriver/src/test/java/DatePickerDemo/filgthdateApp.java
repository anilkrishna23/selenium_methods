package DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filgthdateApp {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("anilkrishna377@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anilarya@23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		String flydate="1-October-2029";
		String [] temp=flydate.split("-");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2];
		 
		driver.findElement(By.id("search-date")).click();
		
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while(!currentyear.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
		}
		
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(!currentmonth.contains(month))
		{
			driver.findElement(By.linkText("Next")).click();
			 currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		 List<WebElement> alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
	     for(WebElement dt:alldate)
	     {
	    	if(dt.getText().equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	      }
	     
	     
	}

}
