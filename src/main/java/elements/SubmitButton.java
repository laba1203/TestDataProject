package elements;

import org.openqa.selenium.By;

public class SubmitButton extends AbstractElement {

//    private By emailFieldLocator = By.xpath("//input[@name='affiliate_member[email]']");

    public SubmitButton(){
        setWebElement(By.xpath("//input[@name='commit']"));
    }

}
