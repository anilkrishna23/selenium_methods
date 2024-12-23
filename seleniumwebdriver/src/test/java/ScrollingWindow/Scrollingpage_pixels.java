package ScrollingWindow;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage_pixels {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		File trgfile = new File("c//demo\\ama.png");
		FileUtils.copyFile(srcfile, trgfile);
		

	}

}
