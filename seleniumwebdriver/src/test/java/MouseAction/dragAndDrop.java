package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	/*	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act =new Actions(driver);
		act.dragAndDrop(rome, italy).build().perform();
		
		WebElement wash=driver.findElement(By.xpath("(//div[@id='box3'])[1]"));
		WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions acts=new Actions(driver);
		acts.dragAndDrop(wash, us).perform();
	*/
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html\r\n");
		WebElement amount=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement account=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(amount, account).build().perform();
	}
}
