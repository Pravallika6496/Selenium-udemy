import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ngendigital.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_billing_name")));	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		driver.switchTo().frame("iframe-015");
		WebElement ele = driver.findElement(By.xpath("//input[@name='FirstName']"));
		ele.sendKeys("Pravallika");
		//String text = driver.findElement(By.xpath("//input[@name='FirstName']")).getText();
		String text = ele.getAttribute("value");
		System.out.println("Hi " +text);
		ele.clear();
		System.out.println("Text cleared. The text in the field is: " +ele.getAttribute("value"));
		driver.close();

	}

}
