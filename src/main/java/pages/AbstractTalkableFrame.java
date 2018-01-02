package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.DriverConfig;

public abstract class AbstractTalkableFrame {

    private WebElement iFrameElement;
    private By iFrameLocator;
    private WebDriver driver = new DriverConfig().getDriver();
    private WebDriverWait wait = new DriverConfig().getWait();


    //Log messages:
    private String successMessage = "Talkable IFrame is available";
    private String iFrameMissedMessage = "Talkable Iframe is not avilable on the page";
    //


    private void verifyIfTalkablePresent(){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(iFrameLocator));
            System.out.println(successMessage);

        }
        catch (org.openqa.selenium.NoSuchElementException e){
            Assert.assertFalse(false, iFrameMissedMessage);
        }

    }

    void setiFrameElement(By iFrameLocator) {
        this.iFrameLocator = iFrameLocator;
        this.iFrameElement = driver.findElement(iFrameLocator);
    }

    public void switchToIFrame(){
        verifyIfTalkablePresent();
        driver.switchTo().frame(iFrameElement);

    }



}
