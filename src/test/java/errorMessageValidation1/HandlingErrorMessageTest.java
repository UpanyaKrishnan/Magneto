package errorMessageValidation1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingErrorMessageTest {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            driver.get("https://magento.softwaretestingboard.com/");

            HandlingErrorMessage_1 registrationPage = new HandlingErrorMessage_1(driver);

            registrationPage.clickCreateAccountLink();

            System.out.println("Create an Account URL is: " + driver.getCurrentUrl());
            System.out.println("The Page title is: " + driver.getTitle());

            // Click Create Account button without entering data
            registrationPage.clickCreateAccountButton();

            // Print error messages
            System.out.println("First Name Field Error message: " + registrationPage.getFirstnameErrorMessage());
            System.out.println("Last Name Field Error message: " + registrationPage.getLastnameErrorMessage());
            System.out.println("Email Field Error message: " + registrationPage.getEmailErrorMessage());
            System.out.println("Password Field Error message: " + registrationPage.getPasswordErrorMessage());
            System.out.println("Confirm Password Field Error message: " + registrationPage.getConfirmPasswordErrorMessage());

        } finally {
            driver.quit();
        }
    }
}
