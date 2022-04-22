package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	    //Click the Alert box
	    
	   driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	   
	 
	   
	   Thread.sleep(2000);
	   
	   //Accept the alert
	   //Step 1:Switch to the alert
	   
	   Alert alert=driver.switchTo().alert();
	   
	   
	  // Step 2:Get the Alert Text
	   
	   System.out.println(alert.getText());
	   
	   //Step 3:Accept the Alert
	   
	   alert.accept();
	   
	   //Confirmation Alert
	   
	   driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	   
	   Alert alert2 = driver.switchTo().alert();
	   
	   System.out.println(alert2.getText());
	   
	   alert2.dismiss();
	   
	   //Prompt alert
	   
	   driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	   
	   Alert alert3 = driver.switchTo().alert();
	   
	   System.out.println(alert3.getText());
	   
	   //Type the text using sendkeys
	   
	   alert3.sendKeys("Non IT");
	   
	   //Accept the alert
	   
	   alert3.accept();
	   
	   
	   
	   }
	
	

}
