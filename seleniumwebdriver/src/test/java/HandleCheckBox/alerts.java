package HandleCheckBox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// normal alert with ok button
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    
    	Thread.sleep(4000);
    	 Alert my=driver.switchTo().alert();  
    	System.out.println( my.getText());
    	my.accept(); 
	*/
		
		//2) conformation alert -ok & cancel
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String alertmgs= driver.switchTo().alert().getText();
		if(alertmgs.contains("Ok"))
			{
	           driver.switchTo().alert().accept();	
			}else
			{
				driver.switchTo().alert().dismiss();
			}
	*/
	  	
		//3) prompt alert - input box
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert myalert= driver.switchTo().alert();
		myalert.sendKeys("welcom");
		myalert.accept();
	*/
		
		
		
		
		
	}
}
