package Magneto_Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    // Locators
    private By createAccountLink = By.partialLinkText("Create an");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public String getCreateAccountLinkText() {
        return driver.findElement(createAccountLink).getText();
    }

    public void clickCreateAccountLink() {
        driver.findElement(createAccountLink).click();
    }
}
