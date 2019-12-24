import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://ngendigital.com/practice");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://ngendigital.com/demo-application");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page refreshed");
	}

}
