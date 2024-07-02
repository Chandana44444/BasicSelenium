package TestNG_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_002 extends BaseClass{
@Test
public void FT_01() throws InterruptedException {
	Reporter.log("from method",true);
	MainPage_Elements page1=new MainPage_Elements(driver);
	System.out.println(page1.getEle_01().isDisplayed());//false
	Assert.assertTrue(page1.getEle_01().isDisplayed(), "ele is not present");
	page1.getEle_01().click();
	System.out.println(driver.getCurrentUrl());
	Assert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricens.com/141-inch-laptop","not landed to webpage");
	Thread.sleep(5000);
	driver.findElement(By.id("add-to-cart-button-31")).click();
	
}
}