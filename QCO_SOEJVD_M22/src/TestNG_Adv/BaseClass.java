package TestNG_Adv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ListenerImplemantation.class)
public class BaseClass {
	public static ChromeDriver driver;
@BeforeSuite
public void beforesuite() {
	Reporter.log("connection to database");
	Reporter.log("beforesuite",true);
}
@BeforeTest
public void beforetest() {
	Reporter.log("beforetest",true);
}
@BeforeClass
public void beforeclass() {
	Reporter.log("launch browser and navigate to app");
	Reporter.log("beforeclass",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");

}
@BeforeMethod
public void beforemethod() {
	Reporter.log("login to app");
	Reporter.log("beforemethod",true);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzabc");
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
}
@AfterSuite
public void aftersuite() {
	Reporter.log("dis-connection to database");
	Reporter.log("aftersuite",true);
}
@AfterClass
public void afterclass() {
	Reporter.log("close browser");
	Reporter.log("afterclass",true);
	driver.close();
}
@AfterTest
public void aftertest() {
	Reporter.log("aftertest",true);
}
@AfterMethod
public void aftermethod() {
	Reporter.log("logout app");
	Reporter.log("aftermethod",true);
	driver.findElement(By.linkText("Log out")).click();
}
}
