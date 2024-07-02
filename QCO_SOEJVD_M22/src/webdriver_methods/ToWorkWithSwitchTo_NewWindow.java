package webdriver_methods;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSwitchTo_NewWindow {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.skillrary.com/");
		System.out.println("title of app in new tab:"+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demo.vtiger.com/vtigercrm/");
		System.out.println("title of app in new tab:"+driver.getTitle());
		Thread.sleep(2000);
//		driver.quit();
		

	}

}
