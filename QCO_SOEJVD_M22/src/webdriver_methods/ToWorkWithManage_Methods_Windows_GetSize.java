package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_GetSize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Before Maximising:"+driver.manage().window().getSize());
//		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println("After Maximising:"+size);
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		int height_01 = driver.manage().window().getSize().height;
		int width_01 = driver.manage().window().getSize().width;
		System.out.println("***********************************");
		System.out.println(height_01+" "+width_01);
		System.out.println("Height:"+height+"  "+"Width:"+width);
		Thread.sleep(2000);
		driver.close();


	}

}
