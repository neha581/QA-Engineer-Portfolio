package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    // Static block to load the config.properties file once
    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/config/config.properties");
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file!");
        }
    }

    // Method to fetch a property by its key
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
