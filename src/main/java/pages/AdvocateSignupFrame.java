package pages;

import elements.EmailField;
import elements.FirstName;
import elements.SubmitButton;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AdvocateSignupFrame extends AbstractTalkableFrame{

    private SitePage parentSite;
    private By iFrameLocator = By.xpath("//iframe[@name='talkable-offer-iframe']");

//    Elements on the iframe:
    private FirstName firstName;
    private EmailField emailField;
    private SubmitButton submitButton;



    public AdvocateSignupFrame(){
        setiFrameElement(iFrameLocator);
        switchToIFrame();

        //initialization of elements inside iFrame
        firstName = new FirstName();
        emailField = new EmailField();
        submitButton = new SubmitButton();


    }

    public void populateFields(String name, String email){
        firstName.sendKeys(name);
        emailField.sendKeys(email);
        submitButton.click();


    }





}


