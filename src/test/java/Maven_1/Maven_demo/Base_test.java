package Maven_1.Maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class Base_test {
	WebDriver driver;
    Actions act;
	@BeforeSuite
	public void browser_launch() {
	//WebDriverManager.chromedriver().setup();
	String driverPath = System.getProperty("user.dir") + "\\src\\Browser_drivers\\chromedriver_2.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	 act=new Actions(driver);
	}

	
	
	
}
