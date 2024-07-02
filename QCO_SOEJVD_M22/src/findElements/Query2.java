package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.className("topic-html-content")).getText());
	Thread.sleep(3000);
	driver.close();
}
}
