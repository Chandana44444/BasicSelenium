package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_ClassName {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("email")).sendKeys("demo_1234");
		Thread.sleep(4000);
		driver.close();
	}

}
