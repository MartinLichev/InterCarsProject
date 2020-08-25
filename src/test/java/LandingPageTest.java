import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {

    @Test
    public static void getToLoginPage() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
    }

    @Test
    public static void navigateToContacts() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        contactInterCarsLinkClick(webDriver);

    }

    @Test
    public static void changeToBulgarianLanguage() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        languageBarClick();
    }

    @AfterTest
    public static void quitDriver() {

        exitDriver(webDriver);
    }

}
