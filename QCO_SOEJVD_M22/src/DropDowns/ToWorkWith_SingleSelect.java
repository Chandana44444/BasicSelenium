package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWith_SingleSelect {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement single_select = driver.findElement(By.id("drop1"));
	Select s=new Select(single_select);
//	s.selectByIndex(4);//doc 4
//	s.selectByVisibleText("doc 1");//doc 1
	s.selectByValue("ghi");//doc 2
}
}
