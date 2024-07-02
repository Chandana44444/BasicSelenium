package TestNG_Adv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_Elements {
public MainPage_Elements(ChromeDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(linkText = "14.1-inch Laptop")
 private WebElement ele_01;

public WebElement getEle_01() {
	return ele_01;
}

}
