package elements;

import org.openqa.selenium.By;

public class EmailField extends AbstractElement{

    private By emailFieldLocator = By.xpath("//input[@name='affiliate_member[email]']");

    public EmailField(){
        setWebElement(emailFieldLocator);
    }

}
