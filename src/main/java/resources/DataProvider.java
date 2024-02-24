package resources;

import java.util.HashMap;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "DataPVD")
    public Object[][] getData(){
        return new Object[][]{
                {"Ngoc","hahah","14/10/2022","15/12/2023","90000","mama"},
                {"Khai","hahah","14/10/2022","15/12/2023","90000","mama"},
                {"Nam","hahah","14/10/2022","15/12/2023","90000","mama"}

        };
    }

}
