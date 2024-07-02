package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunch_app4 {
@Test
public void m1() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://chat.qspiders.com/");
	Thread.sleep(4000);
	driver.close();
}
}
