package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="D:\\Automation Testing\\com.sharkNinja\\src\\test\\java\\features",glue={"stepDefination","helper"},tags="@Reg",
plugin="html:target/test/report.html")

public class TestRunner extends AbstractTestNGCucumberTests {

}
