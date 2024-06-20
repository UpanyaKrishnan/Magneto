package CreateAnAccount;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getHomePageTitle() {
        return driver.getTitle();
    }
}
