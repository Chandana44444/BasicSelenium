package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Name {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.name("Email")).sendKeys("demeo");
//		WebElement element = driver.findElement(By.name("Email"));
//		System.out.println(element);
//		element.sendKeys("daemeo");
		Thread.sleep(4000);
		driver.close();
	}

}
