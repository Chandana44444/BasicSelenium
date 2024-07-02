package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_FullScreen{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.kalkifashion.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
//		driver.close();

	}

}
