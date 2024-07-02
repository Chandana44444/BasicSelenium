package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_LinkText {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		System.out.println("after clicking on register link:"+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}

}
