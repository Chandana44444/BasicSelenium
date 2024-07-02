package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWith_MultiSelect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement multi_select = driver.findElement(By.id("multiselect1"));
	Select s=new Select(multi_select);
//	for(int i=0;i<3;i++) {
//		s.selectByIndex(i);//Audi	
//	}
	s.selectByIndex(3);//Audi
	System.out.println("count of choices selected:"+s.getAllSelectedOptions().size());//1
	s.selectByVisibleText("Swift");//Swift
	s.selectByValue("volvox");//volvo
	System.out.println("count of choices selected:"+s.getAllSelectedOptions().size());//3
//	s.selectByIndex(2);//Audi
	Thread.sleep(3000);
	System.out.println("is it multi select dropdown:"+s.isMultiple());
//	s.deselectByIndex(1);//swift
//	s.deselectByVisibleText("Volvo");//volvo
//	s.deselectByValue("audix");//audi
	s.deselectAll();//deselect every choice thats selected already
	System.out.println("Total count of choices available:"+s.getOptions().size());//4
	System.out.println("Choices names:"+multi_select.getText());
}
}
