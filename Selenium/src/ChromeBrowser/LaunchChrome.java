package ChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\Downloads\\chromedriver.exe");
				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
