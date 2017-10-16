package samplegrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sample {

	static WebDriver driver;
	
	static String nodeUrl;
	
	public static void main(String [] args) throws MalformedURLException{
		
		
		nodeUrl = "http://172.16.30.164:5555/wd/hub";
		
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		driver= new RemoteWebDriver(new URL(nodeUrl), cap);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
		
	}

}
