package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configLoader {
    Properties properties;

    public configLoader(String filePath){
        loadProperties(filePath);
    }

    private void loadProperties(String filePath){
        properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error with properties file: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getProperty(String path){
      return properties.getProperty(path);
    }
}
