package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement conty=driver.findElement(By.xpath("//select[@id='country']"));
		 
		Select listcountry= new Select(conty);
		//listcountry.selectByVisibleText("India");
		//listcountry.selectByValue("uk");
		listcountry.selectByIndex(5);
		
		//capture the option from the drop drown
		List<WebElement> option=listcountry.getOptions();
		System.out.println(option.size());//10
		
		//capture the option text from drop drown
		
	/*	for(int i=0;i<option.size();i++)
		{
			System.out.println( option.get(i).getText());
		}*/
		
       
		
		for(WebElement optinos:option)
		{
		
			System.out.println(optinos.getText());
		}
		
	
	 
	}

}
