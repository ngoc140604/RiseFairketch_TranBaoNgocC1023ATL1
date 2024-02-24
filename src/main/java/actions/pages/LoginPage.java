package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.LoginPageITF;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void openTheWebsite(String url) {
        openUrl(driver, url);

    }


    public void inputUserIdAndPassword(String email, String password) {
        clearValueInElement(driver, LoginPageITF.txbEmail);
        sendkeyToElement(driver, LoginPageITF.txbEmail, email);
        clearValueInElement(driver, LoginPageITF.txbPassWord);
        sendkeyToElement(driver, LoginPageITF.txbPassWord, password);

    }

    public void clickLogin() {
        clickToElement(driver, LoginPageITF.btnSubmit);;
    }
}
