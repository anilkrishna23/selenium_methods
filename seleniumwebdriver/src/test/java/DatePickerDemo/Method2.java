package DatePickerDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2 {

	public static void selectFeatureDate(WebDriver driver, String year,String month,String date)
	{
		while(true)
		{
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentyear.contains(year) ||currentmonth.contains(month))
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
	
	
	public static void selectPastDate(WebDriver driver, String year,String month,String date)
	{
		while(true)
		{
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentyear.contains(year) ||currentmonth.contains(month))
			{
				
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
	
		driver.switchTo().frame(0);
		String year="2002";
		String month="May";
		String date="23";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//selectFeatureDate(driver,year,month,date);
		selectPastDate(driver, year, month, date);
	}

}
