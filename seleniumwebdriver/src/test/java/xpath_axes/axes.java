package xpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class axes {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://money.rediff.com//gainers/bse/daily/groupa");
	    
		//self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Federal Bank')]/self::a")).getText();
	     System.out.println(text);//federal bank
	     
	     
	     // parent
	     
	     text=driver.findElement(By.xpath("//a[contains(text(),'Federal Bank')]/parent::td")).getText();
	     System.out.println(text);//federal bank
	     
	     //child
	     List<WebElement> childs= driver.findElements(By.xpath("//a[contains(text(),'Federal Bank')]/ancestor::tr/child::td"));
	     System.out.println("number of child element:"+childs.size()); //5
	     
	     //Ancestor
	     text = driver.findElement(By.xpath("//a[contains(text(),'Federal Bank')]/ancestor::tr")).getText();
	     System.out.println(text);  //Federal Bank A 184.70 200.70 + 8.66 Buy  |  Sell
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	
}
