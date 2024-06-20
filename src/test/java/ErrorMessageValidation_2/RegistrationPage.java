package ErrorMessageValidation_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;

    // Locators
    private By createAccountLink = By.partialLinkText("Create an");
    private By personalInformationSection = By.xpath("//span[normalize-space()='Personal Information']");
    private By firstNameLabel = By.xpath("//span[normalize-space()='First Name']");
    private By firstNameField = By.id("firstname");
    private By lastNameLabel = By.xpath("//span[normalize-space()='Last Name']");
    private By lastNameField = By.name("lastname");
    private By secondSectionLabel = By.cssSelector("fieldset[class='fieldset create account'] legend[class='legend'] span");
    private By emailLabel = By.xpath("//span[normalize-space()='Email']");
    private By emailField = By.id("email_address");
    private By passwordLabel = By.cssSelector("label[for='password'] span");
    private By passwordField = By.id("password");
    private By confirmPasswordLabel = By.xpath("//span[normalize-space()='Confirm Password']");
    private By confirmPasswordField = By.name("password_confirmation");
    private By createAccountButton = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickCreateAccountLink() {
        driver.findElement(createAccountLink).click();
    }

    public String getPersonalInformationSectionText() {
        return driver.findElement(personalInformationSection).getText();
    }

    public String getFirstNameLabelText() {
        return driver.findElement(firstNameLabel).getText();
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameElement = driver.findElement(firstNameField);
        firstNameElement.sendKeys(firstName);
    }

    public String getLastNameLabelText() {
        return driver.findElement(lastNameLabel).getText();
    }

    public void enterLastName(String lastName) {
        WebElement lastNameElement = driver.findElement(lastNameField);
        lastNameElement.sendKeys(lastName);
    }

    public String getSecondSectionLabelText() {
        return driver.findElement(secondSectionLabel).getText();
    }

    public String getEmailLabelText() {
        return driver.findElement(emailLabel).getText();
    }

    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.sendKeys(email);
    }

    public String getPasswordLabelText() {
        return driver.findElement(passwordLabel).getText();
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public String getConfirmPasswordLabelText() {
        return driver.findElement(confirmPasswordLabel).getText();
    }

    public void enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordField);
        confirmPasswordElement.sendKeys(confirmPassword);
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }
}
