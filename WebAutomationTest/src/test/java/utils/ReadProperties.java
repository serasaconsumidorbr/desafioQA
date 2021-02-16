package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private static final String PROPERTIES = "./src/test/resources/config.properties";
    private static Properties properties;

    public static String readValue (String value) {

        ReadProperties.properties = new Properties();

            try{
                    InputStream input = new FileInputStream(PROPERTIES);
                    ReadProperties.properties.load(input);
            }
            catch(IOException e) {
                e.printStackTrace();
            }

        return ReadProperties.properties.getProperty(value);
    }
}
