package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.DashBoardITF;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends AbstractPage {
    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTaskMenu(String value) {
        clickToElement(driver, DashBoardITF.TXT_MENU, value);
    }
}
