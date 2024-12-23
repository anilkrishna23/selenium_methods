package Automationpage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allActions {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.findElement(By.id("name")).sendKeys("Anil");
			driver.findElement(By.id("email")).sendKeys("anil@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("1234567897");
			driver.findElement(By.id("textarea")).sendKeys("1-34 hyd");
			
			//gender
			driver.findElement(By.id("male")).click();
			
			Thread.sleep(2000);
			//checkBoxs
			List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			
			for(WebElement check:checkboxes)
			{
				check.click();
				System.out.println(check.getText());
			}
			
			//country
			WebElement cons =driver.findElement(By.id("country"));
			Select ac= new Select(cons);
			ac.selectByVisibleText("India");
			
			
			List<WebElement>conoptions=ac.getOptions();
			for(WebElement op:conoptions)
			{
				System.out.println(op.getText());
			}
	
	   //color
		WebElement col=	driver.findElement(By.id("colors"));
		Select colr= new Select(col);
		colr.selectByIndex(2);
		
		List<WebElement> col_option=colr.getOptions();
		for(WebElement cols:col_option)
		{
			System.out.println(cols.getText());
		}
		
	//animals
	
		WebElement ani=	driver.findElement(By.id("animals"));
		Select anis= new Select(ani);
		anis.selectByVisibleText("Fox");
		
		List<WebElement> animls=anis.getOptions();
		for(WebElement allanimal:animls)
		{
			System.out.println(allanimal.getText());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
