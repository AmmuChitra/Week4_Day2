package Week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement Click1 = driver.findElement(By.id("Click"));
		
		driver.findElement(By.id("Click1")).click();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		File image =new File("./snap/img.jpg");
		
		FileUtils.copyFile(screenshotAs, image);
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(null)
		
		
		
		
		
	

	}

}
