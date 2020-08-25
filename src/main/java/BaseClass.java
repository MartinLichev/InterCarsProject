import Pages.CatalogLandingPage;
import javafx.scene.shape.Path;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import sun.misc.PostVMInitHook;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass extends CatalogLandingPage {

    public static WebDriver webDriver;

    public static void maximizeWindow(WebDriver driver) {

        driver.manage().window().maximize();
    }

    public static void navigateToURL(String URL) {

        webDriver.navigate().to(URL);
    }

    public static void implicitWait(int time, TimeUnit timeUnit) {

        webDriver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public static void fluentWait(int time) throws InterruptedException {

        Wait webDriverWait = new FluentWait<WebDriver>(webDriver);

        webDriverWait.wait(time);
    }

    public static void deleteCookies(WebDriver driver) {

        driver.manage().deleteAllCookies();
    }

    public static void readPropertyFile(String filePath, String propertyName) {

        Properties properties = new Properties();

        try {

            InputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
            System.out.println(properties.getProperty(propertyName));

        } catch (FileNotFoundException fileNotFoundException) {

            System.out.println("File is not located!");

        } catch (IOException ioException) {

            ioException.printStackTrace();
        }
    }

    public static void mouseHover(WebDriver driver, WebElement element) {

        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();

    }


    public static void initializePageElements(WebDriver webDriver, Object pageObject) {

        PageFactory.initElements(webDriver, pageObject);

    }

    public static void exitDriver(WebDriver webDriver) {

        webDriver.quit();
    }

    public static void testLoad(String browser, WebDriver webDriver, int loopsCount){

        String pageTittle;


        for (int i = 0; i <= loopsCount ; i++) {

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

            webDriver.navigate().to("https://bg.e-cat.intercars.eu/bg/welcome");
            System.out.println("Page tittle is:" + webDriver.getTitle());
            pageTittle = webDriver.getTitle();

            if(pageTittle.equals("IC E-Catalog")){

            }else{

                throw new AssertionError("Wrong Page!");

            }

        }

    }
}
