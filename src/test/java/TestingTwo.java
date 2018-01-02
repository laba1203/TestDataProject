import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SitePage;
import util.DriverConfig;

public class TestingTwo {

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
    }

}
