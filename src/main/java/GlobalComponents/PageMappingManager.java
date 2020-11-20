package GlobalComponents;

import java.io.*;
import java.util.Properties;

import static GlobalComponents.FileLocation.mappingFileLoc;

public class PageMappingManager {

    public static Properties mappingObj = new Properties();
    public static InputStream input = null;

    public static Properties getMappingObj() throws NullPointerException{
        File file = new File(mappingFileLoc);
        try{
            input = new FileInputStream(file);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{ ;
            mappingObj.load(input);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return mappingObj;
    }

}
