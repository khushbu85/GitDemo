import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
	
	public static WebDriver driver;
	
	@Test
	
	public void test() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khushbu.daga\\eclipse-workspacenew\\DataHybrid\\src\\test\\resources\\executables\\chromedriver.exe");
		driver =  new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.quit();
	}

}
