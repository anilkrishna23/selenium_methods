package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement colo=driver.findElement(By.id("colors"));
			
			Select colors= new Select(colo);
		   //colors.selectByVisibleText("Blue"); //Blue
			//colors.selectByIndex(3);  //yellow
	        colors.selectByValue("green"); //green
	        
	        List<WebElement> option=colors.getOptions();
	         System.out.println( option.size());
	
	        for(WebElement op:option)
	        {
	        	System.out.println(op.getText());
	        }
	
			WebElement animal= driver.findElement(By.id("animals"));
			Select ani= new Select(animal);
			ani.selectByVisibleText("Fox");
			
			List<WebElement> lists=ani.getOptions();
			System.out.println(lists.size());
			
			for(WebElement element:lists)
			{
				System.out.println(element.getText());
			}
	
	      
		 // drag and drop
			
			WebElement srcelement,trgelement;
			srcelement=driver.findElement(By.id("draggable"));
			trgelement=driver.findElement(By.id("droppable"));
			Actions ac=new Actions(driver);
			ac.dragAndDrop(srcelement, trgelement);
			ac.build().perform();
			
			
			//pop up and alerts
			//simple alert
			driver.findElement(By.id("alertBtn")).click();
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			//conformation alert  ok& cancel
			driver.findElement(By.id("confirmBtn")).click();
			
			String alert=driver.switchTo().alert().getText();
			if(alert.contains("Ok"))
			{
				driver.switchTo().alert().accept();
			}
			else {
				driver.switchTo().alert().dismiss();
			}
			
			//promt alert
			driver.findElement(By.id("promptBtn")).click();
			Alert my=driver.switchTo().alert();
			my.sendKeys("Allu Arjun");
			my.accept();
	}

}
