import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ngendigital.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe-015");
		
		Select selExmpl = new Select(driver.findElement(By.id("FromCity")));
		List<WebElement> cityOptions = selExmpl.getOptions();
		//for (Object obj : cityOptions) {System.out.println(obj);}
		int size=cityOptions.size();
		for(int i=0; i<size; i++) {
		    System.out.println(cityOptions.get(i).getText());
		} 
		selExmpl.selectByValue("ord");
		System.out.println("Selected Chicago");
	}

}
