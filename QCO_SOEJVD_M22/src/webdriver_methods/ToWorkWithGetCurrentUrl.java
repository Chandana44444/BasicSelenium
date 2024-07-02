package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetCurrentUrl {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.get("hop.tricentis.com/");//invalid argument exception
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
