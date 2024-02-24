package testcases;

import actions.commoms.AbstractTest;
import actions.pages.DashBoardPage;
import actions.pages.LoginPage;
import actions.pages.TaskPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_AddTask extends AbstractTest {

    WebDriver driver;
    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    TaskPage taskPage;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeClass(String browser) {
        driver = openMultiBrowse(browser);


    }

    @Test(priority = 1)
    public void TC01_Login() {
        loginPage = new LoginPage(driver);
        System.out.println("Step 1: Open the website");
        loginPage.openTheWebsite("https://rise.fairsketch.com/signin");

        System.out.println("Step 2: Enter UserName and Password");
        loginPage.inputUserIdAndPassword("admin@demo.com", "riseDemo");

        System.out.println("Step 3: Click login");
        loginPage.clickLogin();

    }


    @Test(priority = 2)
    public void TC02_AddTask() {
        dashBoardPage = new DashBoardPage(driver);
        System.out.println("Step 4: Click Tasks");
        dashBoardPage.clickTaskMenu("Tasks");

        System.out.println("Step 5: Click Button Addtasks");
        taskPage.clickAddTasks();

        System.out.println("Step 6: Fill form");
        taskPage.fillAllForm();


    }

}
