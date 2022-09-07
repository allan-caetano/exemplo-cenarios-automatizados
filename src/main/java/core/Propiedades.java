package core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Propiedades extends BaseTest {
    public static boolean FECHAR_BROWSER = false;

    Properties prop = new Properties();
    File file = new File("src/main/resources");

    public void initialCreate() throws Exception {
        prop.load(new FileInputStream(file.getAbsolutePath() + "/acesso.properties"));
        DriverFactory.getDriver().get(prop.getProperty("URL_SITE"));
    }

}
