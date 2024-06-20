package errorMessageValidation3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandlingErrorMessages_3Test {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            driver.get("https://magento.softwaretestingboard.com/");

            HandlingErrorMessages_3 registrationPage = new HandlingErrorMessages_3(driver);

            registrationPage.clickCreateAccountLink();

            System.out.println("Personal Information Section Label: " + registrationPage.getPersonalInformationSectionText());
            System.out.println("First Name Label: " + registrationPage.getFirstNameLabelText());
            registrationPage.enterFirstName("");

            System.out.println("Last Name Label: " + registrationPage.getLastNameLabelText());
            registrationPage.enterLastName("");

            System.out.println("Email Label: " + registrationPage.getEmailLabelText());
            registrationPage.enterEmail("");

            System.out.println("Password Label: " + registrationPage.getPasswordLabelText());
            registrationPage.enterPassword("");

            System.out.println("Confirm Password Label: " + registrationPage.getConfirmPasswordLabelText());
            registrationPage.enterConfirmPassword("");

            registrationPage.clickCreateAccountButton();

            // Print error messages
            System.out.println("First Name Field Error message: " + registrationPage.getFirstNameErrorMessage());
            System.out.println("Last Name Field Error message: " + registrationPage.getLastNameErrorMessage());
            System.out.println("Email Field Error message: " + registrationPage.getEmailErrorMessage());
            System.out.println("Password Field Error message: " + registrationPage.getPasswordErrorMessage());
            System.out.println("Confirm Password Field Error message: " + registrationPage.getConfirmPasswordErrorMessage());

        } finally {
            driver.quit();
        }
    }
}
