package fligthsApp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("anilkrishna377@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anilarya@23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String admin=driver.findElement(By.xpath("//div[@class='profile-usertitle-name']")).getText();
		System.out.println(admin);
		if(admin.contains("Anil"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		
	   /*String v  =driver.findElement(By.xpath("//div[@class='profile-usertitle-name']"));
	    boolean ex=false;
	    if(driver.findElement().isDisplayed())
		{
			ex=true;
		}
*/
	}

}
