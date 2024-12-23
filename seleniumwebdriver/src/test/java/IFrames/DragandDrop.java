package IFrames;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 //driver.findElement(By.xpath("(//div[@id='HTML2'])[1]"))
          // driver.switchTo().frame(driver.findElement(By.xpath("(//div[@id='HTML2'])[1]")));
           WebElement screlement,trgelement;
           screlement=driver.findElement(By.id("draggable"));
           trgelement=driver.findElement(By.id("droppable"));
           
           Actions act= new Actions(driver);
           act.dragAndDrop(screlement, trgelement);
           act.build().perform();
           
	}

}
