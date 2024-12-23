package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test case
1) Launch browser (chrome)
2) Open URL https://demo.opencart. com
3) Validate title should be "Your Store"
4) close browser
*/

public class firstTestCase {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		 
		
		driver.get("http://demo.opencart.com");
		  String act_title=driver.getTitle();
		  if(act_title.equals("Your Store"))
		  {
			  System.out.println("testpass");
		  }else
		  {
			  System.out.println("test failed");
		  }
		driver.quit();
	}

}
