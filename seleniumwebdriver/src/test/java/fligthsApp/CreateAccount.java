package fligthsApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("ajay");
		driver.findElement(By.id("contact")).sendKeys("6305306022");
		driver.findElement(By.id("email")).sendKeys("ajaypappu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ajaypappu@123");
		driver.findElement(By.name("dob")).sendKeys("04.01.2003");
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();

	}

}
