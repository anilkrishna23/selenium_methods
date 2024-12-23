package Getmethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://opensource-demo.orangehrmlive.com"); 
		driver.get("https://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		List<String> windowList = new ArrayList(allwindows);
		String window1=windowList.get(0);
		String window2 = windowList.get(1);
		
		driver.switchTo().window(window2);
		/*driver.findElement(By.linkText("Community")).click();
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("identifierId")).sendKeys("anil");
		System.out.println();
		*/
		
		driver.findElement(By.linkText("Google Account")).click();
		allwindows=driver.getWindowHandles();
		String window3= windowList.get(3);
		
		driver.switchTo().window(window3);
		
		System.out.println(driver.getTitle());

	}

}
