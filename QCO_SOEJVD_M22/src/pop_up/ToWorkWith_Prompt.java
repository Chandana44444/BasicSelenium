package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Prompt {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	Thread.sleep(2000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("yugug");
	a.accept();//ok
//	a.dismiss();//cancel
	Thread.sleep(4000);
	driver.quit();
}
}
