package org.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try {
            InputStream inputStream =
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream("config/LIVE_Config.properties");

            if (inputStream == null) {
                throw new RuntimeException("Config.properties not found in classpath");
            }

            properties.load(inputStream);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load configurations", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
