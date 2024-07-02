package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManage_Methods_Windows_SetSize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kalkifashion.com/");
		System.out.println("Size before resizing:"+driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension size = new Dimension(900,-750);//minimum 150 difference shud be there btw height and width and height shud be less 
		//and can give only +ve value else exception:out of range exception(invalid exception)
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		System.out.println("Size after resizing:"+driver.manage().window().getSize());
		driver.close();

	}

}
