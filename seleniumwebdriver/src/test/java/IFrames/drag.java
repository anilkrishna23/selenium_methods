package IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//WebElement frame1= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'])[1]"));
		//driver.switchTo().frame(frame1);
		 WebElement srcelement,trgelement;
		 srcelement=driver.findElement(By.xpath("//(li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		 trgelement=driver.findElement(By.xpath("//div[@id='trash'][1]"));
		 Actions act = new Actions(driver);
		 act.dragAndDrop(srcelement, trgelement);
		 act.build().perform();
		
		
		
	}

}
