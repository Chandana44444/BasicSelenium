package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(30000);
//		driver.findElement(By.id("compare")).click();
		driver.findElement(By.xpath(" //*[local-name()='svg' and @data-testid=\"InfoOutlinedIcon\"]")).click();
		Thread.sleep(6000);
//		driver.close();//will close the tab where driver is focusing on 
//		driver.quit();// will close all tabs(browser)

	}

}
