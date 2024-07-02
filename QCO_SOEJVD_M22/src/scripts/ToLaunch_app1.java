package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunch_app1 {
@Test
public void m1() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(4000);
	driver.close();
}
}
