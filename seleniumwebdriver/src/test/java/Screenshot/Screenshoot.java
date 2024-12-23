package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshoot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://orangehrm.qedgetech.com");		
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
			
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Change Password")).click();
			
			// code to capture screenshot
			
			/*TakesScreenshot ts = (TakesScreenshot)driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File trgfile = new File("c:\\demo\\ChgPwd_defect.png");
			FileUtils.copyFile(srcfile, trgfile);*/
//			
//			TakesScreenshot ts =(TakesScreenshot)driver;
//			  File srcfile =ts.getScreenshotAs(OutputType.FILE);
//			  File trgfile = new File("c://demo\\chwpd__ss.png");
//			  FileUtils.copyFile(srcfile, trgfile);
			TakesScreenshot ts= (TakesScreenshot)driver;
			File srcfile= ts.getScreenshotAs(OutputType.FILE);
			File trgfile =new File("C:\\sql\\sc.png");
			FileUtils.copyFile(srcfile, trgfile);

	}

}
