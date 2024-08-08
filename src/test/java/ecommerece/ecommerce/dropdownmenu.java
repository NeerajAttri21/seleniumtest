package ecommerece.ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownmenu {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
//		driver.manage().window().maximize();
		
          Thread.sleep(5000);
//       //using Action class
//         WebElement target= driver.findElement(By.id("developers-dd-toggle"));
//         Actions s=new Actions(driver);
//         WebElement target11=driver.findElement(By.xpath("//a[@title='Support']//span[@class='item-text'][normalize-space()='Support']"));
//         s.moveToElement(target).perform();
//         Thread.sleep(5000);
//         s.click(target11);
//         s.build().perform();
//         
//         driver.findElement(By.xpath("//a[@title='BrowserStack Logo']")).click();
//         
//         WebElement target12=driver.findElement(By.xpath("//div[@class='bstack-mm-products-nav bstack-mm-li']//button[@id='products-dd-toggle']"));
//         
//         s.moveToElement(target12).perform();
//         driver.findElement(By.xpath("//span[normalize-space()='Web Testing']")).click();
//         
//         WebElement target13=driver.findElement(By.xpath("//span[normalize-space()='Accessibility Testing']"));
//         s.click(target13).build().perform();
//         
        
//        WebElement s=driver.findElement(By.id("'developers-dd-toggle"));         
//        Select ss=new Select(s);        
//        ss.selectByIndex(2);
       // Thread.sleep(5000);
        
      
		/*
		 * WebElement s=driver.findElement(By.name("country"));
		 * 
		 * Select ss=new Select(s); ss.selectByIndex(1); Thread.sleep(5000);
		 */
		//ss.selectByVisibleText(null)
		
		/*
		 * WebElement rr=driver.findElement(By.xpath("//input[@value='1']"));
		 * 
		 * rr.click();
		 * 
		 * if(rr.isSelected()) {
		 * 
		 * System.out.println("Return True"); } else System.out.println("Return False");
		 */
      
		// Calcualte no of radio button is present
          
//          Dimension rr=new Dimension(550,550);
//         driver.manage().window().setSize(rr);
//          
//         
//          //List<WebElement> myElements= driver.findElements(By.xpath("//input[@name='sex']"));
//          
//           String s=driver.getCurrentUrl();
//           
//           if(s.equals("https://www.facebook.com/r.php?locale=en_GB&display=page"))
//           {
//        	   
//        	   System.out.println("URL are same");
//           }
//           else
//        	   System.out.println("URL are not same");
          
          
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(5000);//button[@title='Toggle']//*[name()='svg']
		driver.manage().window().maximize();
Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lucky");
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("attriniraj@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("attriniraj@gmail.com");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Neeraj@21");
//		Select day=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
//		day.selectByValue("22");
//		Select month=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
//		month.selectByIndex(2);
//		
//		Select year=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
//		year.selectByIndex(2);
//	
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//input[@value='1']")).click();
		//driver.findElement(By.xpath("//title[@id='pageTitle']")).click();
		
//	List<WebElement>tt=	driver.findElements(By.tagName("a"));
//	System.out.println("Size of the list elements are:"+tt.size());
//	
//	for(WebElement ee:tt)
//	{
//		
//		System.out.println(ee.getAttribute("href"));
//	}
		//button[@title='Toggle']//*[name()='svg']
		
		
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		List<WebElement> cc= driver.findElements(By.xpath("//span[@class='rct-checkbox']//*[name()='svg'][2]"));
		
		int p=cc.size();
		
		for(int i=0;i<p;i++)
		{
		    String s= cc.get(i).getAttribute("class");
		    
		    if(s.equals("Desktop"))
		    {
		    	
		    	System.out.println("hello");
		    	break;
		    }
			
		}
	}}
