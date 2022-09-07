package core.utils;

import core.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ActionsUtils {

    public static final String userDir = System.getProperty("user.dir");
    public static final String fileSeparator = System.getProperty("file.separator");

    public static boolean createDirectoryIfNotExists(String path) throws SecurityException {
        File file = new File(path);
        return createDirectoryIfNotExists(file);
    }
    public static boolean createDirectoryIfNotExists(File file) throws SecurityException {
        return file.exists() ? true : file.mkdirs() ? true : false;
    }
    public static String getProperty(String path, String key) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        return properties.getProperty(key);
    }

    public static void clicarComJS(WebElement elemento) {
        JavascriptExecutor jsDriver = ((JavascriptExecutor) DriverFactory.getDriver());
        jsDriver.executeScript("arguments[0].click();", elemento);
    }

    public static void clickJavaScript(WebElement element, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

}
