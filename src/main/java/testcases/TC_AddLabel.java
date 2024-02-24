package testcases;

import actions.commoms.AbstractTest;
import actions.pages.DashBoardPage;
import actions.pages.LoginPage;
import actions.pages.Projects;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.DataProviderFactory;

import java.util.HashMap;

public class TC_AddLabel extends AbstractTest {
    WebDriver driver;
    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    Projects projects;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeClass(String browser) {
        driver = openMultiBrowse(browser);

    }

    @Test(dataProvider ="Data", dataProviderClass = DataProviderFactory.class, priority = 1)
    public void TC01_AddLabels(HashMap<String,String> map) {
        loginPage = new LoginPage(driver);
        System.out.println("Step 1: Open the website");
        loginPage.openTheWebsite("https://rise.fairsketch.com/signin");

        System.out.println("Step 2: Enter UserName and Password");
        loginPage.inputUserIdAndPassword("admin@demo.com", "riseDemo");

        System.out.println("Step 3: Click login");
        loginPage.clickLogin();

        System.out.println("Step 4: Click Task Menu with value 'projects'");
        dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.clickTaskMenu("Projects");

        System.out.println("Step 5: Click Manage labels");
        projects = new Projects(driver);
        projects.clickManageLabel();

        System.out.println("Step 6: Add Label 1");
        projects.addLabels(map.get("label1"));

        System.out.println("Step 07: CLick close");
        projects.clickClose();
        projects.clickManageLabel();

        System.out.println("Step 8: Add Label 2");
        projects.addLabels(map.get("label2"));
        projects.verify();
        projects.clickClose();



    }
    @Test(dataProvider ="Data", dataProviderClass = DataProviderFactory.class,priority = 2)
    public void TC02_AddProjects(String title,String des,String startdate,String deadline,String price,String labels){
        projects.clickAddProject();
        projects.fillAllfieldInForm(S);



    }

}
