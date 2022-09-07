package runner;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"html:target/report-html.html",  "json:target/cucumber-report/cucumber.json"},
        publish = true,
        features = "./src/main/resources/",
        glue = "step",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@test-web"
)
public class Runner {

    @AfterClass
    public static void finalizaTudo() {
        DriverFactory.killDriver();
    }
}