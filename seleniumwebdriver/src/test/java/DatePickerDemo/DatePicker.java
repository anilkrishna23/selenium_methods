package DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//method1: sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("21/04/2025");
	
		//method2: using datepicker
	/*	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String dob="23/May/2025";
		String [] temp=dob.split("/");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
				
	   Select ylist= new Select(driver.findElement(By.className("ui-datepicker-year")));
	   ylist.selectByVisibleText(year);
	   
	   Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
	   mlist.selectByVisibleText(month);
	   
	   WebElement cal=driver.findElement(By.className("ui-datepicker-calendar"));
	   List<WebElement>rows=driver.findElements(By.tagName("tr"));
	   for(int i=1;i<rows.size();i++)
	   {
		  List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		  for(WebElement element:cols)
		  {
			  if(element.getText().equals(dt))
			  {
			  element.click();
			  break;
			  }
		  }
				  
	   }*/
		
		//method2 : using date picker
		String year="2050";
		String month="May";
		String date="23";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //acutalyear
			String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //acutalmonth
			
			if(currentyear.contains(year)&&currentmonth.contains(month))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previse 
			
		}
		
	//select date
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
