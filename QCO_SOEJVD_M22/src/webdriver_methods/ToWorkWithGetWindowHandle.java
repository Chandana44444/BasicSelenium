package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetWindowHandle{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kalkifashion.com/");
		String id = driver.getWindowHandle();
//		Set<String> ids = driver.getWindowHandles();
		System.out.println(id);
		Thread.sleep(2000);
		driver.close();


	}

}
