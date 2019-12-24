import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
//import org.junit.Test;

public class TakeScreenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ngendigital.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		File ScrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Below line of code isn't working because FileUtils class is missing. Created a class with dummy method, but no implementation
		try {
			FileUtils.copyFile(ScrFile, new File("C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\Screenshots\\Practice.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();

	}

}
