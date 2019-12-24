package com.udemy.selenium.section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravallika.tambabatt\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		WebElement addCucumberButton = driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/following::button[text()='ADD TO CART'][1]"));
		addCucumberButton.click();
		//h4[text()='Cucumber - 1 Kg']/following::button[text()='ADD TO CART'][1]
	}
}
