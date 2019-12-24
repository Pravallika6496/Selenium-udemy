import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSJ {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1")));
		
		Select selectCurrency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		selectCurrency.selectByVisibleText("USD");
		System.out.println("Selected US Dollar");
		
//		Select fromCity= new Select(driver.findElement(By.xpath("//div[@id='marketCityPair_1']//select[@id='ctl00_mainContent_ddl_originStation1']")));
//		driver.findElement(By.xpath("//div[@id='marketCityPair_1']//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
//		fromCity.selectByValue("MAA");
//		
//		Select toCity = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
//		toCity.selectByVisibleText("Bengaluru");
	}

}
