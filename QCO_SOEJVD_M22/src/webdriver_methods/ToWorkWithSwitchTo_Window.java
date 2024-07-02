package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.Page.GetAppIdResponse;

public class ToWorkWithSwitchTo_Window {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		Set<String> all_windows_id = driver.getWindowHandles();
		System.out.println(all_windows_id);
		Thread.sleep(10000);
		for(String id:all_windows_id) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}		
		driver.quit();// will close all tabs(browser)
	}
}

//arr= {12,13,14};
//arr[0]
//arr[i]

//collections={13,14,15};
//get(0)
//get(i)
