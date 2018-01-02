package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.DriverConfig;


public class SitePage {
    private DriverConfig driverConfiguration = new DriverConfig();
    private WebDriver driver = driverConfiguration.getDriver();
    private WebDriverWait wait = driverConfiguration.getWait();
    private AdvocateSignupFrame standaloneFrame;

    private String siteLink;

//    public FirstName firstName;


    public SitePage(String siteLink) {
        this.siteLink = siteLink;
        driver.navigate().to(siteLink);
    }

    public void switchToTalkableFrame(){
        standaloneFrame = new AdvocateSignupFrame();

    }


    public void open() throws InterruptedException {
        driver.navigate().to(siteLink);

    }

    public void populateFrame(String name, String email){
        if (standaloneFrame == null){
            Assert.assertFalse(false, "standaloneFrame is null");
        }
        standaloneFrame.populateFields(name, email);

    }



}