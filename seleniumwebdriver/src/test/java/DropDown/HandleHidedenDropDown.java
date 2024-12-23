package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHidedenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
	    driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]")).click();
	    
	    Thread.sleep(3000);
	    //single option
	   // driver.findElement(By.xpath("(//span[normalize-space()='Automaton Tester'])[1]")).click();
	
	   // count the options
	    List<WebElement> option=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	    System.out.println("number of element:"+ option.size() );
	    
	    for(WebElement op:option)
	    {
	    	
	    	System.out.println(op.getText());
	    }
	
	}

}
