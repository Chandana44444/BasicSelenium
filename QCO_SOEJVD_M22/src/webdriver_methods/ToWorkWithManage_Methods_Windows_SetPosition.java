package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_SetPosition{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(7000);
		Point p=new Point(70,90);
		driver.manage().window().setPosition(p);
		Thread.sleep(7000);
//		driver.close();


	}

}
