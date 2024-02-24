package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.AddTaskITF;
import org.openqa.selenium.WebDriver;


public class TaskPage extends AbstractPage {
    WebDriver driver;
    
    public TaskPage(WebDriver driver) {
        this.driver=driver;

    }
    public void clickAddTasks(){
        clickToElement(driver,AddTaskITF.BTN_ADDTASK);
    }


    public void selectValueIndropdownList(String combobox, String value){
        clickToElement(driver,AddTaskITF.DROPDOWNSLIST,combobox);
        clickToElement(driver,AddTaskITF.OPTIONS,value);
    }


    public void fillAllForm() {
        System.out.println("Input title");
        sendkeyToElement(driver,AddTaskITF.IP_TITLE,"Practice 1");

        System.out.println("Input Description");
        sendkeyToElement(driver,AddTaskITF.TXB_DESCRIPTIONS,"This is practice for me");

        System.out.println("Select Related to with value Contract");
        selectValueIndropdownList("Related to","Contract");

        System.out.println("Select Points with 3 Points");
        selectValueIndropdownList("Points","3 Points");

        System.out.println("Select contract with Website Design and Development Contract");
        selectValueIndropdownList("Contract","Demo Client");

        System.out.println("Select contract with Website Design and Development Contract");
        selectValueIndropdownList("Contract","Website Design and Development Contract");

        System.out.println("Select Points with 3 Points");
        selectValueIndropdownList("Points","3 Points");

        System.out.println("Select Assign to with value Mark Thomas");
        selectValueIndropdownList("Assign to", "Mark Thomas");

        System.out.println("Select Collaborators with value Mark Thomas");
        selectValueIndropdownList("Collaborators", "Mark Thomas");

        System.out.println("Select Status with value In progress");
        selectValueIndropdownList("Status", "To do");

        System.out.println("Select Priority with value Critical ");
        selectValueIndropdownList("Priority", "Critical");

        System.out.println("Select Labels with value Bug ");
        selectValueIndropdownList("Labels", "Bug");

        System.out.println("Enter startdate");
        sendkeyToElement(driver,AddTaskITF.IP_STARTDATE,"25/10/2012");

        System.out.println("Enter endate");
        sendkeyToElement(driver,AddTaskITF.IP_STARTDATE,"25/12/2024");

        clickToElement(driver,AddTaskITF.BTN_SAVE);


    }
}
