package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class HomePage {


    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[1]/a/i")
    public static WebElement homeButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[1]/a")
    public static WebElement aboutUsTab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[2]/a")
    public static WebElement portfolioTab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[3]/a")
    public static WebElement trainingTab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[4]/a")
    public static WebElement VIPClubtab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[5]/a")
    public static WebElement careersTab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[6]/a")
    public static WebElement catalogTab;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div/nav/div[4]/ul/li[7]/a")
    public static WebElement contactsTab;

    public static String urlHomePage = "https://bg.intercars.eu/bg/";

    public static HomePage homePage = new HomePage();

    public static void aboutUsTabSelect(){

        aboutUsTab.click();
    }

    public static void portfolioTabSelect(){

        portfolioTab.click();
    }

    public static void trainingTabSelect(){

        trainingTab.click();
    }

    public static void VIPClubTabSelect(){

        VIPClubtab.click();
    }

    public static void careersTabSelect(){

        careersTab.click();
    }

    public static void catalogTabSelect(){

        catalogTab.click();
    }

    public static void contactsTabSelect(){

        contactsTab.click();
    }
}
