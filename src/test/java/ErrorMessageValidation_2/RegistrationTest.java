package ErrorMessageValidation_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RegistrationTest {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            driver.get("https://magento.softwaretestingboard.com/");

            RegistrationPage registrationPage = new RegistrationPage(driver);

            registrationPage.clickCreateAccountLink();

            // Verify sections and fields
            System.out.println("Personal Information Section Label: " + registrationPage.getPersonalInformationSectionText());
            System.out.println("First Name Label: " + registrationPage.getFirstNameLabelText());

            registrationPage.enterFirstName("Upanya");
            System.out.println("Successfully filled First Name field");

            System.out.println("Last Name Label: " + registrationPage.getLastNameLabelText());
            registrationPage.enterLastName("Krishnan");
            System.out.println("Successfully filled Last Name field");

            System.out.println("Second Section Label: " + registrationPage.getSecondSectionLabelText());

            System.out.println("Email Label: " + registrationPage.getEmailLabelText());
            registrationPage.enterEmail("abcd@gmail.com");
            System.out.println("Email field filled out");

            System.out.println("Password Label: " + registrationPage.getPasswordLabelText());
            registrationPage.enterPassword("Hijkl@123");
            System.out.println("Password field filled out");

            System.out.println("Confirm Password Label: " + registrationPage.getConfirmPasswordLabelText());
            registrationPage.enterConfirmPassword("Hijkl@123");

            registrationPage.clickCreateAccountButton();

            // Additional verification or assertions can be added here

        } finally {
            driver.quit();
        }
    }
}
