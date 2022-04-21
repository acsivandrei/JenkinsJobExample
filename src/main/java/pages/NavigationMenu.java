package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//clasa de page objects
public class NavigationMenu {
	
//initializarea variabilei
	WebDriver driver;
	
//constructor
	public NavigationMenu(WebDriver driver) {
		this.driver = driver;
	}
	
//locator
	public By shopLink = By.linkText("BOOKS");
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By postFormatPageLink = By.linkText("Post Formats");
	
//metode specifice
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
//metoda hover
	public void hoverMenu(By locator) {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

}
