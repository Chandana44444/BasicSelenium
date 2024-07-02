package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Alert {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	a.accept();
	Thread.sleep(3000);
	driver.close();
}
}
