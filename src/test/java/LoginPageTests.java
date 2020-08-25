import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseClass {

    @Parameters({"browser"})
    @BeforeTest
    public static void instantiateDriver(String browser) {

        if (browser.toLowerCase().equals("firefox")) {

            System.out.println("-- Starting Firefox Web Driver! --");
            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
            webDriver = new FirefoxDriver();
            System.out.println("-- Firefox Driver is Started! --");
            webDriver.manage().window().maximize();

        }

        if (browser.toLowerCase().equals("chrome")) {

            System.out.println("-- Starting Chrome Web Driver! --");
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
            webDriver = new ChromeDriver();
            System.out.println("-- Chrome Driver is Started! --");
            webDriver.manage().window().maximize();
        }

    }

    @Test
    public static void usernameOnlyLogin() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterUsername("bobo");
        Login();

    }

    @Test
    public static void passwordOnlyLogin() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterPassword("12345");
        Login();

    }

    @Test
    public static void usernameAndPasswordLogin() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterUsername("bobo");
        enterPassword("12345");
        Login();

    }

    @Test
    public static void rememberMeCheckboxTick() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterUsername("bobo");
        enterPassword("12345");
        tickRemembermeCheckBox();
        Login();

    }

    @Test
    public static void enterUsernameCyrillicCharacters() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterUsername("Асен");
        enterPassword("123334");
        tickRemembermeCheckBox();
        Login();

    }

    @Test
    public static void enterPasswordCyrillicCharacters() {
        navigateToURL(urlLandingPage);
        initializePageElements(webDriver, catalogLandingPage);
        loginButtonClick();
        initializePageElements(webDriver, catalogLoginPage);
        enterUsername("Marto");
        enterPassword("Петър");
        tickRemembermeCheckBox();
        Login();

    }

    @AfterTest
    public static void quitDriver() {

        exitDriver(webDriver);
    }


}
