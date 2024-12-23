package AutoSuggestionAjax;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(5000);
			List<WebElement>keyslist =driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
			
			System.out.println(keyslist.size());
			for(WebElement element:keyslist)
			{
				System.out.println(element.getText());
			}

			/*for(int i=0;i<keyslist.size();i++)
			{
				System.out.println(keyslist.get(i).getText());
				if(keyslist.get(i).getText().equals("selenium"))
				{
					keyslist.get(i).click();
					break;
				}
			}*/
			
	}

}
