package Login_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class popup {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/jquery/modals/forms/");
        
      
    
        Thread.sleep(5000);
       
        
       // driver.findElement(By.xpath("")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navbar-static-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("abc123@gmail.com");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("rutvik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/button")).click();
        	
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"navbarLogin\"]/div/div/div[1]/ul/li[2]/a")).click();
      Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"signonname\"]")).sendKeys("Rutvik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"signonusername\"]")).sendKeys("abc12457");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc12390909@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"signonpassword\"]")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password2\"]")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"AJAXAuthRegisterBtn\"]")).click();
	
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(" //*[@id=\"AJAXAuthRegisterBtn\"]")).click();
//        Thread.sleep(2000);
        Thread.sleep(5000);
        driver.findElement(By.id("navbar-account")).click();
        //Thread.sleep(2000);
	}

}
