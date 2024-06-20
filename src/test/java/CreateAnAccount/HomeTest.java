package CreateAnAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeTest {
    static WebDriver driver;

    public static void main(String[] args) {
        HomeTest headless = new HomeTest();
        headless.headlessChrome();
    }
    
    public void headlessChrome() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
            driver.get("https://magento.softwaretestingboard.com/");
            
            HomePage homePage = new HomePage(driver);
            System.out.println("Title is: " + homePage.getHomePageTitle());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit(); // Close the WebDriver instance
            }
        }
    }
}
