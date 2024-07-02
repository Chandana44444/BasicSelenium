package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_Minimize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
//		driver.get("https://www.kalkifashion.com/");
		driver.manage().window().minimize();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
//		driver.close();

	}

}
