import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DayFiveLearnings {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		//Open Browser:
		WebDriver driver = new ChromeDriver();
		
		//Open AUT:
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//To capture the current page title:
		
		String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  
		//Element handling by link text locator:
		  driver.findElement(By.linkText("Link Test")).click();
		  
		//To navigate previous page:
		  driver.navigate().back();
		  
		//Element handling by partial link text locator:
		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		
		//To navigate previous page:
		driver.navigate().back();
		  
		//To navigate next page:		 
		driver.navigate().forward();
		
		//To navigate previous page:
		driver.navigate().back();

		 //To refresh the page:
		 driver.navigate().refresh();
		 
		 //Handling element by Name locator:
		 driver.findElement(By.name("firstname")).sendKeys("Swapnil");
		 driver.findElement(By.name("lastname")).sendKeys("Shrivastava");
		 
		 //handling element by id locator:
		 driver.findElement(By.id("sex-0")).click();
		 
		 //handling element by css Selector:
		 driver.findElement(By.cssSelector("#exp-6")).click();
		 
		 //handling element by xpath:
		 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("5/12/2019");
		 
		 //clearing text/numbers:
		 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).clear();
		 
		 Thread.sleep(5000);
		 //close browser:
		 driver.close();
		  
		// TODO Auto-generated method stub

	}

}
