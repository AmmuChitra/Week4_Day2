package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement mens = driver.findElement(By.className("desktop-main"));
	    
	    Actions builder =new Actions(driver);
	    
	    builder.moveToElement(mens).perform();
	    
		
	}

}
