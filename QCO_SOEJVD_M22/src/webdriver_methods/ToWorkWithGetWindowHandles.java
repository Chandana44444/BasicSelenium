package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		Set<String> all_windows_id = driver.getWindowHandles();
		System.out.println(all_windows_id);
		Thread.sleep(6000);
		driver.quit();// will close all tabs(browser)

	}

}
