package org.Elight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginsite {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Public\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
	}
}
