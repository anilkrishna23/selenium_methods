package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class paritalxPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com");
		
		//single attribute
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("mac");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("laptop");
	
     	//multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'] [@placeholder='Search']")).sendKeys("lap");
	
		// xpath with 'and ' operator
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("lap");
	
		// xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("lap");
		
		// xpath with text()-- inner text
		
	   //driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		
		// xpath with contains()
		//Search
		
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("shits");
		
		//xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("shits");
		
		
		//chained xpath
		   boolean imagesstatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imagesstatus);
		
	}

}
