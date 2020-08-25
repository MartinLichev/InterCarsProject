import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTests extends BaseClass {

    @Test
    public static void selectAllTabs() {
        navigateToURL(urlHomePage);
        initializePageElements(webDriver,homePage);
        aboutUsTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        portfolioTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        trainingTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        VIPClubTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        careersTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        catalogTabSelect();
        implicitWait(30, TimeUnit.SECONDS);
        contactsTabSelect();

    }
}
