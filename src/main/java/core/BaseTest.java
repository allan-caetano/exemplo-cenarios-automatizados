package core;

import core.utils.DateUtils;
import funcionalidade.TestFunc;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import junit.framework.Test;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static core.DriverFactory.getDriver;
import static core.utils.DateUtils.*;

public class BaseTest {

//    public void gravarVideo() throws ATUTestRecorderException {
//        recorder = new ATUTestRecorder("C:\\Users\\Allan.Caetano\\Desktop\\FrameWork\\target\\video" ,true);
//
//                recorder.start();
//    }

    protected void freeze(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.err);
        }
    }

    @After
    public void addEvidencie() throws Exception {
        TakesScreenshot screen = (TakesScreenshot) getDriver();
        File arquivo = screen.getScreenshotAs(OutputType.FILE);
                 FileUtils.copyFile(arquivo, new File("src/main/java/evidence" + File.separator +
                    File.separator + obterDataEHoraAtualFormatada() +  ".jpg"));
        if(Propiedades.FECHAR_BROWSER) {
            DriverFactory.killDriver();
        }
    }
}
