package ecommerece.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	WebDriverManager.chromedriver().setup();    	
    	WebDriver driver = new ChromeDriver();    	
    	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");    	
    	driver.manage().window().maximize();
    	
    	
    	
    	
    	
    	
    }
}
