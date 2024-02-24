package interfaces;

public class ProjectITF {

    //label[normalize-space(text())='Labels']/following::div/ul/li/input
    public static final String BTN_LABELS = "//a[@title='Manage labels']";
    public static final String TXB_LABELS = "//input[@id='title']";
    public static final String BTN_SAVE = "//button[@type='submit']";
    public static final String LABELS = "//div[@id='label-show-area']//span[1]";
    public static final String COLORS_CHOICE = "//div[@class='modal-content']//span";
    public static final String BTN_ADDPROJECT = "//a[@title='Add project']";
    public static final String BTN_CLOSE = "//div[@class='modal-footer']/button[3]";
    public static final String TXB_TITLE = "//input[@id='title']";
    public static final String TAR_DESCRIPTION = "//textarea[@id='description']";

    public static final String TXB_STARTDATE = "//input[@id='start_date']";
    public static final String TXB_DEADLINE = "//input[@id='deadline']";
    public static final String TXB_PRICE = "//input[@id='price']";
    public static final String TAR_LABELS = "//label[normalize-space(text())='Labels']/following::div/ul/li/input";

}
