package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogLoginPage extends HomePage {

    @FindBy(xpath = "//*[@id='loginForm:username']")
    public static WebElement userField;

    @FindBy(xpath = "//*[@id='loginForm:password']")
    public static WebElement passwordField;

    @FindBy(xpath = "/html/body/div/div/div/form/div[4]/div/div/a")
    public static WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@id='rememberme']")
    public static WebElement remembermeCheckBox;

    @FindBy(xpath = "//*[@id='loginForm:loginButton']")
    public static WebElement loginButton;

    public static String urlLoginPage = "https://sso.intercars.eu/oxauth/login.htm";

    public static CatalogLoginPage catalogLoginPage = new CatalogLoginPage();

    public static void enterUsername(String userName) {

        if(userField.isDisplayed()){

            userField.click();
            userField.sendKeys(userName);

        }else{

            System.out.println("Element not found!");
        }

    }

    public static void enterPassword(String password) {

        if(passwordField.isDisplayed()){

            passwordField.click();
            passwordField.sendKeys(password);

        }else{

            System.out.println("Element not found!");
        }

    }

    public static void clickForgotPasswordLink() {

        if(forgotPasswordLink.isDisplayed()){

            forgotPasswordLink.click();

        }else{

            System.out.println("Element not found!");
        }

    }

    public static void tickRemembermeCheckBox() {

        if(remembermeCheckBox.isDisplayed()){

            remembermeCheckBox.click();

        }else{

            System.out.println("Element not found!");
        }

    }

    public static void Login() {

        if(loginButton.isDisplayed()){

            loginButton.click();

        }else{

            System.out.println("Element not found!");
        }

    }

}
