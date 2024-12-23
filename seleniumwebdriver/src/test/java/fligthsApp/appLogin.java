package fligthsApp;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class appLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("anilkrishna377@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anilarya@23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	
		
		 //driver.findElement(By.id("search-date")).sendKeys("11/29/2024");
		String year="2025";
		String month="January";
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
		 WebElement from= driver.findElement(By.xpath("(//select[contains(@class,'sf2')])[1]"));
		 Select myfrom= new Select(from);
		 myfrom.selectByVisibleText("Kolkatha");
		 
		 WebElement to =driver.findElement(By.xpath("(//select[contains(@class,'sf3')])[1]"));
		 Select myto = new Select(to);
		 myto.selectByVisibleText("Hyderabad");
		 
		 driver.findElement(By.xpath("//button[normalize-space()='Search Flights']")).click();
		
		 Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement sel=driver.findElement(By.xpath("//button[normalize-space()='Select']"));
		act.moveToElement(sel);
		act.click().perform();
		
		driver.findElement(By.id("name")).sendKeys("Ajay");
		driver.findElement(By.xpath("//button[normalize-space()='Insert Order']")).click();
		
		Thread.sleep(2000);
		
		boolean ex=false;
		String myticket=driver.findElement(By.xpath("//a[normalize-space()='View Ticket']")).getText();
		if(myticket.contains("View Ticket"))
		{
			ex=true;
		}
		
		driver.findElement(By.xpath("//div[@class='dropdown account-menu-dropdown']")).click();
		driver.findElement(By.linkText("Logout")).click();
			
	}
}
		
