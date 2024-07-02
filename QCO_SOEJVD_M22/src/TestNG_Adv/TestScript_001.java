package TestNG_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_001 extends BaseClass{
@Test
public void FT_01() {
	Reporter.log("from method",true);
//	driver.findElement(By.id("small-searchterms")).sendKeys("computers",Keys.ENTER);
	driver.findElement(By.linkText("14.1-inch Laptop")).click();
	driver.findElement(By.id("add-to-cart-button-31")).click();
}
}
