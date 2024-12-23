package DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fligthAppDate {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("anilkrishna377@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anilarya@23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		
		
		/*String flydate="23-October-2030";
		String [] temp=flydate.split("-");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2]; */
		String year="2050";
		String month="May";
		String date="23";
		
		
		driver.findElement(By.id("search-date")).click();
		while(true)
		{
			
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		if(currentyear.equals(year)&&currentmonth.equals(month)) 
		{
			break;
			
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
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
