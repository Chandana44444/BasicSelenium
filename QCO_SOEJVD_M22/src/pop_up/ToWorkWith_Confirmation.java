package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Confirmation {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://licindia.in/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Pay Premium")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
//	a.accept();//ok
	a.dismiss();//cancel
	Thread.sleep(3000);
	driver.quit();
}
}
