package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_GetPosition{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println("before:"+driver.manage().window().getPosition());
//		driver.manage().window().fullscreen();
//		driver.get("https://www.kalkifashion.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		Point axis_values = driver.manage().window().getPosition();
		System.out.println("x-axis value:"+driver.manage().window().getPosition().getX());
		System.out.println("y-axis value:"+driver.manage().window().getPosition().getY());
		System.out.println("after:"+axis_values);
		Thread.sleep(2000);
		driver.close();


	}

}
