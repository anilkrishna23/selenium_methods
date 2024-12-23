package HandleCheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://testautomationpractice.blogspot.com");
		//List<WebElement> check=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
       //2) select all checkbox
		/*for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
		}*/
		
		/*for(WebElement checkbox:check)
		{
			checkbox.click();
		}*/
		
		//3) select last 3 checkboxes
		//total no of checkboxes how many checkboxes want to select = starting index
		//7-3=4 (starting index)
	/*	for(int i=4;i<check.size();i++)
		{
			check.get(i).click();
		}*/
		
		
		//4)select frist 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			check.get(i).click();
		}*/
		
		 //5)) unselect checkboxes if they are selceted
		
		
	    /*   for(int i=0;i<3;i++)	
	       {
	    	   check.get(i).click();
	       }
		 Thread.sleep(5000);
		  for(int i=0;i<check.size();i++)
		  {
			if(check.get(i).isSelected())
			{
			  check.get(i).click();
		  }
	 
		  }*/
		  
		  
		  driver.get("https://testautomationpractice.blogspot.com/");
	
		  //WebElement  check =	driver.findElement(By.cssSelector("(//input[@type='checkbox'])[9]"));
			List<WebElement> check= driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(WebElement checkbox:check)
			{
				checkbox.click();
			}
		
			
		  
		  
	}

}
