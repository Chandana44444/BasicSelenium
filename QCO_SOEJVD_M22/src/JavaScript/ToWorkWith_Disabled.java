package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Disabled {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss3_enabled_disabled");
	driver.switchTo().frame("iframeResult_0");
	WebElement disabled_ele = driver.findElement(By.xpath("//input[@value=\"Disneyland\"]"));
	driver.executeScript("arguments[0].value='hi all'; ",disabled_ele);
}
}
//arguments={ele1,ele2};
//arguments[0]
//sendkeys,value