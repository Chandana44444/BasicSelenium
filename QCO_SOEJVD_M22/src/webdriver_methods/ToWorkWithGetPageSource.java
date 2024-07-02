package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetPageSource {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.kalkifashion.com/");
//		driver.get("hop.tricentis.com/");//invalid argument exception
		String source_code = driver.getPageSource();
		System.out.println(source_code);
		
		

	}

}
