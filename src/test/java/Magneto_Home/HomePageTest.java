package Magneto_Home;

import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageTest {

    public static void main(String[] args) {
        // To hide Info Bar
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        try {
            driver.get("https://magento.softwaretestingboard.com/");

            HomePage homePage = new HomePage(driver);

            System.out.println("Home Page URL is: " + homePage.getHomePageUrl());
            System.out.println("The Page title is: " + homePage.getHomePageTitle());

            String createAccountText = homePage.getCreateAccountLinkText();
            System.out.println("Link for Create an Account is: " + createAccountText);

            homePage.clickCreateAccountLink();

            // Perform further actions on the Create Account page if needed

        } finally {
            driver.quit(); // Quit the entire browser session
        }
    }
}
