package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.switchTo().frame(0);
	    
	    WebElement frame1 = driver.findElement(By.id("Click"));
	    
	    frame1.click();
	    
	    System.out.println(frame1.getText());
	    
	    //want to get outside the frame by using the method id driver.switchTo().default content
	    
	    driver.switchTo().defaultContent();
	    
	    
	    driver.switchTo().frame(1);
	    
	    driver.findElement(By.id("Click1")).click();
	    
	    System.out.println(Frame2.getText());
	    
	    
	       
	}

}
