package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_Maximize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
//		driver.close();

	}

}
