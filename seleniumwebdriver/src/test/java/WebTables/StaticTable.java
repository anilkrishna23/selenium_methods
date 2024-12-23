package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			 
			//find total no of rows tables
			
		  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		  System.out.println(rows);

			//List<WebElement> rows=driver.findElement(By.name("BookTable")).findElements(By.tagName("tr"));
			//System.out.println(rows.size());
			
			// 2) find total number of columns in a table
		
			int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println(cols);
			
			//List<WebElement> cols=driver.findElement(By.name("BookTable")).findElements(By.tagName("th"));
			//System.out.println(cols.size());
			
			int col=driver.findElements(By.tagName("th")).size();
			System.out.println(col);
			
			//3) Read data from spec   row and cols
			String in=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
			System.out.println(in);
			
			String ins=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
			System.out.println(ins);
			 
			//4 read date from all the rows and column
			
		/*	for(int r=2;r<=rows;r++)
			{
			
				for(int c=1;c<=cols;c++)
				{
					String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ r+"]//td["+c+"]")).getText();
					System.out.print(value+" ");
				}
			System.out.println();
			
			}*/
			
			
			//5) print book names whose author is mukesh
		/*	for(int r=2;r<rows;r++)
			{
				String auther=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			    if(auther.contains("Mukesh")) 
			       {
			        	String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			          System.out.println(bookname+"\t"+auther);
			       }
			
			}*/
			
			//6) total price of books
			int total=0;
			for(int r=2;r<rows;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				
			total=total+Integer.parseInt(price);
		
		    }
			System.out.println(total); 
			
	}

}
