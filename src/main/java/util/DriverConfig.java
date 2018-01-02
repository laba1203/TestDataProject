package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.PropertyLoader;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Family on 09-Aug-17.
 */
public class DriverConfig {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private WebDriver setNewDriver(){
//        String os = System.getProperty("os.name").toLowerCase();



        final File file = new File(PropertyLoader.loadProperty("path."+getOS()+".webDriver"));
        System.setProperty(PropertyLoader.loadProperty("webDriver"), file.getAbsolutePath());
        driver = new ChromeDriver();

        return driver;

    }

    private String getOS(){
        System.out.println("Test is running on" + System.getProperty("os.name"));
        return System.getProperty("os.name").toLowerCase().substring(0,3);
    }




    public WebDriver getDriver(){
        if (driver == null){
            driver = new DriverConfig().setNewDriver();
        }
        return driver;
    }

    public WebDriverWait getWait(){
        if(wait == null){
            wait = new WebDriverWait(driver, 5, 1000);
        }
        return wait;
    }

    public void setImplicitlyWait(long l){
        driver.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);

    }


}
