package interfaces;

public class AddTaskITF {

    public static final String DROPDOWNSLIST ="//label[normalize-space(text())='%s']/following::div/a";
    public static final String OPTIONS="//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String BTN_ADDTASK = "//a[@class='btn btn-default'][normalize-space()='Add task']";
    public static final String IP_TITLE = "//input[@name='title']";
    public static final String TXB_DESCRIPTIONS = "//textarea[@name='description']";
    public static final String DRD_RELATEDTO = "//label[@for='context']//following::div/div";
    public static final String OP_RELATEDTO = "//div[@id='select2-drop']//div[text()='Contract']";
    public static final String DRD_CONTRACT = "//label[@for='contract_id']//following::div/div";
    public static final String OP_CONTRACT = "//div[@id='select2-drop']//div[text()='Website Design and Development Contract']";
    public static final String DRD_POINTS = "//label[@for='points']//following::div/div";
    public static final String OP_POINTS = "//div[@id='select2-drop']//div[text()='1 Point']";
    public static final String DRD_ASSIGNTO = "//label[@for='assigned_to']//following::div/div";
    public static final String OP_ASSIGNTO = "//div[@id='select2-drop']//div[text()='Mark Thomas']";
    public static final String DRD_COLLABORATORS = "//label[@for='collaborators']//following::div/div";
    public static final String OP_COLLABORATORS = "//div[@id='select2-drop']//div[text()='Michael Wood']";
    public static final String DRD_STATUS = "//label[@for='status_id']//following::div/div";
    public static final String OP_STATUS = "//div[@id='select2-drop']//div[text()='In progress']";
    public static final String DRD_PRIORITY = "//label[@for='status_id']//following::div/div";
    public static final String OP_PRIORITY = "//div[@id='select2-drop']//div[text()='Critical ']";
    public static final String IP_STARTDATE= "//input[@id='start_date']";
    public static final String IP_ENDDATE= "//input[@id='deadline']";


    public static final String BTN_SAVE = "//button[@type='submit']";


}
