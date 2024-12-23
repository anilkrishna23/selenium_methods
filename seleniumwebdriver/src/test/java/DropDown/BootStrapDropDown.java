package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
            driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
            driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
            
            //select single option
            
            //driver.findElement(By.xpath("//input[@value='Java']")).click();
     
            // capture all the options all find out size
            
           List<WebElement> option =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
           System.out.println(option.size());
          
           for(WebElement op:option)
           {
        	   System.out.println(op.getText());
        	   //op.click();
           }
            
           for(WebElement ops:option)
           {
        	 String opt=ops.getText();
        	 if(opt.equals("C#")||opt.equals("Python"))
        	 {
        		 ops.click();
        	 }
           }
	}

}
