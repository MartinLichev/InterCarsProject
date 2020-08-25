package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class CatalogLandingPage extends CatalogLoginPage {

    @FindBy(xpath = "/html/body/div[2]/div/div/a")
    public static WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/a")
    public static WebElement contactInterCarsLink;

    @FindBy(xpath = "//*[@id='ui-id-1-button']")
    public static WebElement languageBar;

    @FindBy(xpath = "//*[@id=\"ui-id-3\"]")
    public static WebElement languageEnglish;

    @FindBy(xpath = "//*[@id='ui-id-1-button']")
    public static WebElement languageBulgarian;

    @FindBy(xpath = "//*[@id=\"ui-id-52\"]")
    public static WebElement languagePolish;

    @FindBy(xpath = "//*[@id=\"ui-id-53\"]")
    public static WebElement languageRomanian;

    @FindBy(xpath = "//*[@id=\"ui-id-54\"]")
    public static WebElement languageSerbian;

    @FindBy(xpath = "//*[@id=\"ui-id-55\"]")
    public static WebElement languageItalian;

    public static String urlLandingPage = "https://bg.e-cat.intercars.eu/bg/welcome";

    public static CatalogLandingPage catalogLandingPage = new CatalogLandingPage();

    public static void loginButtonClick() {

        if (loginButton.isDisplayed()) {

            loginButton.click();

        } else {

            System.out.println("Element not found!");
        }
    }

    public static void contactInterCarsLinkClick(WebDriver driver) {

        try {

            if (contactInterCarsLink.isDisplayed()) {

                contactInterCarsLink.click();

            } else {

                System.out.println("Element not found!");
            }

        } catch (UnhandledAlertException unhandledAlertException) {

            Alert alert = driver.switchTo().alert();
            alert.accept();
            String textAlert = alert.getText();
            System.out.println(textAlert);
        }
    }

    public static void languageBarClick() {

        if (languageBar.isDisplayed()) {

            languageBar.click();

        } else {

            System.out.println("Element not found!");
        }

    }

    public static void languageBarSelectLanguage(int index, WebElement element) {

        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public static void selectElementsFromLanguageBar(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//*[@id='ui-id-1-button']"));

        element.click();

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@id='ui-id-1-button']"));

        elementList.get(1).click();

    }

}
