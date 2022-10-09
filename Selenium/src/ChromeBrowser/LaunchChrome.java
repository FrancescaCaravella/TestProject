package ChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	public static void main() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\Downloads\\chromedriver.exe");
			
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
