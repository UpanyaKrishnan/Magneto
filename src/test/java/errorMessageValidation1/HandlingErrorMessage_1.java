package errorMessageValidation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingErrorMessage_1 {

    private WebDriver driver;

    // Locators
    private By createAccountLink = By.partialLinkText("Create an");
    private By createAccountButton = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
    private By firstnameError = By.xpath("//div[@id='firstname-error']");
    private By lastnameError = By.xpath("//div[@id='lastname-error']");
    private By emailError = By.xpath("//div[@id='email_address-error']");
    private By passwordError = By.xpath("//div[@id='password-error']");
    private By confirmPasswordError = By.xpath("//div[@id='password-confirmation-error']");

    // Constructor
    public HandlingErrorMessage_1(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickCreateAccountLink() {
        driver.findElement(createAccountLink).click();
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public String getFirstnameErrorMessage() {
        return driver.findElement(firstnameError).getText();
    }

    public String getLastnameErrorMessage() {
        return driver.findElement(lastnameError).getText();
    }

    public String getEmailErrorMessage() {
        return driver.findElement(emailError).getText();
    }

    public String getPasswordErrorMessage() {
        return driver.findElement(passwordError).getText();
    }

    public String getConfirmPasswordErrorMessage() {
        return driver.findElement(confirmPasswordError).getText();
    }
}
