//package ecommerece.ecommerce;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Locator {
//
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//
//		WebDriverManager.chromedriver().setup();
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.adactin.com/");
//
//		Dimension dr = new Dimension(700, 700);
//
//		driver.manage().window().setSize(dr);
//		driver.manage().window().maximize();
//		
////		Thread.sleep(5000);
//
//		WebElement d = driver
//				.findElement(By.xpath("//a[@class='elementor-button elementor-button-link elementor-size-lg']"));
//
//		System.out.println(d.getText());
//
//		d.click();
//		
//		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//        Thread.sleep(5000);
//        JavascriptExecutor js1=(JavascriptExecutor)driver;
//        
//        
//        js1.executeScript("window.scrollBy(0,400)","");
////        
//        
//        
//		WebElement n = driver.findElement(By.name("your-name"));
//		n.sendKeys("lucky");
//		
//	    WebElement p= driver.findElement(By.name("your-phone"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].value='0123456790';", p);
//        
//
//		
//	   driver.findElement(By.xpath("//input[@type='email']")). sendKeys("a@gmail.com");
//	   
//	   driver.findElement(By.name("your-subject")).sendKeys("Query");
//	   driver.findElement(By.name("your-message")).sendKeys("dkhksdkdsjfkldsjkdlsjlkd k fkdjkf  dsjkkldsjfkdjf kd");
//	   
//	   driver.findElement(By.xpath("//input[@value='Submit Quote']")).click();
//	   
//
//	}
//
//}
