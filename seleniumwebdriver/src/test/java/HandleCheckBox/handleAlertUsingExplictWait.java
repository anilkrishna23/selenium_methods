package HandleCheckBox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//handle alert without using switchTo().alert()
//by using explicit wait
public class handleAlertUsingExplictWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    Thread.sleep(4000);
	    
	    Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
	    
    	  
    	System.out.println( myalert.getText());
    	myalert .accept();
	}

}
