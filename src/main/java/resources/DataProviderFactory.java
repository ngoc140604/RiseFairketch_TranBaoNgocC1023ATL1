package resources;

import org.testng.annotations.DataProvider;

import java.util.HashMap;

public class DataProviderFactory {
    @DataProvider(name = "Data")
    public Object[][] getData(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("label1","white");
        map.put("label2","nam");
        map.put("title","Ngoc123");
        map.put("description","ahahahaha");
        map.put("startdate","11/10/2020");
        map.put("deadline","11/10/2022");
        map.put("price","5.000.000");
        map.put("labels","On Track");
        return new Object[][]{{map}
        };
    }

}
