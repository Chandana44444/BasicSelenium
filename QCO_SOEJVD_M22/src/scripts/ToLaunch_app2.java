package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunch_app2 {
@Test
public void m1() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.close();
}
@Test
public void m2() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	driver.close();
}
}
