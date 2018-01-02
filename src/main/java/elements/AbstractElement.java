package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConfig;

public abstract class AbstractElement
{
    private WebElement webElement;
    private By locator;

    private WebDriver driver = new DriverConfig().getDriver();


    public void setWebElement(By locator) {

        webElement = driver.findElement(locator);
        this.locator = locator;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void click(){

        this.webElement.click();
        System.out.println("Click to " + this.getClass().getName());
    }

    public void sendKeys(String value){
        this.webElement.sendKeys(value);
        System.out.println("Enter value: '" + value + "' to " + this.getClass().getName());
    }


}
