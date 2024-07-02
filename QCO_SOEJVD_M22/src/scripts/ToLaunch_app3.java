package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunch_app3 {
@Test
public void m1() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://peter.sh/experiments/chromium-command-line-switches/");
	Thread.sleep(4000);
	driver.close();
}
}
