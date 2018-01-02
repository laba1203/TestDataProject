import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SitePage;
import util.DriverConfig;

public class TestingOne {

    SitePage sitePage;
    WebDriver driver;
    WebDriverWait wait;


    @BeforeTest
    public void setUp(){
        DriverConfig driverConfig = new DriverConfig();
        driver = driverConfig.getDriver();
        new DriverConfig().setImplicitlyWait(10);
        wait = driverConfig.getWait();


    }


    @Test
    public void test1() throws InterruptedException {

        InputValues inputValues = new InputValues();
        inputValues.setVariables("http://learn.talkable.com/QA-Max/void/dashboard.html", 1);

        sitePage = new SitePage(inputValues.getSiteLink());

        sitePage.open();


    }

    @Test
    public void test2() throws InterruptedException {

        sitePage.switchToTalkableFrame();

    }

    @Test
    public void test3(){
        sitePage.populateFrame("Name1", "test@test.com");
    }
}
