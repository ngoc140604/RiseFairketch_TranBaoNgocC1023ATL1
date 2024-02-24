package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.AddTaskITF;
import interfaces.ProjectITF;
import org.openqa.selenium.WebDriver;

public class Projects extends AbstractPage {
    WebDriver driver;

    public Projects(WebDriver driver) {
        this.driver = driver;

    }
    public void selectValueIndropdownList(String combobox, String value){
        clickToElement(driver,AddTaskITF.DROPDOWNSLIST,combobox);
        clickToElement(driver,AddTaskITF.OPTIONS,value);
    }


    public void clickManageLabel() {
        clickToElement(driver, ProjectITF.BTN_LABELS);

    }

    public void addLabels(String text) {
        sendkeyToElement(driver, ProjectITF.TXB_LABELS, text);
        clickToElement(driver, ProjectITF.COLORS_CHOICE);
        clickToElement(driver, ProjectITF.BTN_SAVE);
    }

    public void verify() {
        verifyEquals(driver, ProjectITF.LABELS, "white");
    }

    public void clickClose() {
        clickToElement(driver, ProjectITF.BTN_CLOSE);

    }
    public void clickAddProject(){
        clickToElement(driver,ProjectITF.BTN_ADDPROJECT);

    }

    public void fillAllfieldInForm(String title,String description,String startDate,String endDate,String price,String labels){
        System.out.println("Enter the title");
        sendkeyToElement(driver,ProjectITF.TXB_TITLE,title);
        System.out.println("Enter Project type with Internal Project value");
        selectValueIndropdownList("Project type","Internal Project");
        System.out.println("Enter the description");
        sendkeyToElement(driver,ProjectITF.TAR_DESCRIPTION,description);
        System.out.println("Enter the start date");
        sendkeyToElement(driver,ProjectITF.TXB_STARTDATE,startDate);
        System.out.println("Enter the end date");
        sendkeyToElement(driver,ProjectITF.TXB_DEADLINE,endDate);
        System.out.println("Enter the price");
        sendkeyToElement(driver,ProjectITF.TXB_PRICE,price);
        System.out.println("Enter the labels");
        sendkeyToElement(driver,ProjectITF.TAR_LABELS,labels);
        performEnterAction(driver,ProjectITF.TAR_LABELS);
        System.out.println("Click save button");
        clickToElement(driver,ProjectITF.BTN_SAVE);

    }




}
