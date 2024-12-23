package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class absoultXpath {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com");
		
		//absolute
	    driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("mob");

		// partial xpath
	
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("laptops");
		
		//multiple

		//driver.findElement(By.xpath("//input[@name=\"search\"or @placeholder=\"Search\"]")).sendKeys("mac");
		
		//xpath inner text text()
	    //driver.findElement(By.xpath("//a[text()='MacBook']")).click();	
	}

}
