package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWork_HelperAttribute_dependsongroups {
@Test(groups = "FT")
public void FT_01() throws InterruptedException {
//	int a=10/0;
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
@Test(groups = "FT")
public void FT_02() throws InterruptedException {
	int a=10/0;
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
@Test(dependsOnGroups = "FT")//exception:non existent group
public void IT_01() throws InterruptedException {
	Reporter.log("selenium");
	Reporter.log("selenium-2",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
}
}


