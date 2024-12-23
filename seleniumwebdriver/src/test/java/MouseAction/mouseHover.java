package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/");
		WebElement desk=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions at =new Actions(driver);
		at.moveToElement(desk).moveToElement(mac).click().build().perform();
		
	}

}
