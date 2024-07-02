package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWork_HelperAttribute_dependsonmethods {
@Test
public void reg() throws InterruptedException {
	int a=10/0;
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
@Test(dependsOnMethods = "rg")//exception:non existent method
public void login() throws InterruptedException {
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
}
//run-2     2
//pass-2    0
//fail-0    1
//skipped   1

