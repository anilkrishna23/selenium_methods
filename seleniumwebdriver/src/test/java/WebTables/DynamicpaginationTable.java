package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicpaginationTable {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
	//WebDriver driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
	    WebElement user=driver.findElement(By.xpath("//input[@id='input-username']"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='input-password']"));
		pwd.clear();
		pwd.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
       
		driver.findElement(By.linkText("Customers")).click();

	}

}
