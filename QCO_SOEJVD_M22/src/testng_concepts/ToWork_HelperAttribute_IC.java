package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWork_HelperAttribute_IC {
@Test(invocationCount = 2)
public void method_02() throws InterruptedException {
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
}
//default=1
//if zero=not execute

