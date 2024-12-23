package cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorExp {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//driver.get("http://amazon.in");
	driver.get("http://flipkart.com");
	//tagid  tag#id
	//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("alap");
	//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("moblie");
	
	//tag class  tag.classname
	
	
	//driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("ac");
	
	//tag attributes
	//driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("car");
	
	
	//tag classAttribute
	
	driver.findElement(By.cssSelector("input.Pke_EE[name='q']")).sendKeys("a");
	
	
	
	
	

	}

}
