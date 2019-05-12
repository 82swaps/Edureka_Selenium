import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleTwoEdureka {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//Launch Chrome browser using Selenium WebDriver
		WebDriver driver = new ChromeDriver();
		//Navigate to “https://www.edureka.co/”
		driver.get("https://www.edureka.co/");
		//Maximise the Browser Window
		driver.manage().window().maximize();
		//Inspect the search box with text “Search for a Course” for various attributes usingfirebug
		//Get attributes id,name,xpath,class name,css values
		driver.findElement(By.id("search-inp"));
		driver.findElement(By.className("search_inp collapse giTrackElementHeader"));
		driver.findElement(By.xpath = //*[@id="search-inp"]));
		//Inspect the “Log In” link to get the link text and partial link tex
		driver.findElement(By.linkText("Log In")).click());
		//Usethe below Selenium WebDriver methods to do that
		//please note that in the assignment ,it was not mentioned that for which web element we have to perform below methods?
		driver.findElement(By.id(id));
		driver.findElement(By.name(name));
		driver.findElement(By.className(className));
		driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.cssSelector(selector));
		driver.findElement(By.tagName(name));
		driver.findElement(By.linkText(linkText));
		driver.findElement(By.partialLinkText(linkText));
		// TODO Auto-generated method stub

	}

}
