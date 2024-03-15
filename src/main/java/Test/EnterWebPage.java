package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EnterWebPage {
   public static void main(String[] args) {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\namra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://thesportstak.com/");
   }
		
		



}
