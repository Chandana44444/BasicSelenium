package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNavigate_Methods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(4000);
//		driver.get("https://demowebshop.tricentis.com/login");
//		Thread.sleep(4000);
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		driver.navigate().refresh();
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		driver.navigate().to("https://www.kalkifashion.com/");//if correct than only will navigate else exception(invalid argument)
		URL url=new URL("https://www.kalkifashion.com/");//if wrong malformed url exception
		driver.navigate().to(url);
		Thread.sleep(4000);
		driver.quit();

	}

}
