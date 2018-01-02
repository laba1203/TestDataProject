package elements.advocateSharePage;

import elements.AbstractElement;
import org.openqa.selenium.By;

public class ShareViaEmailButton extends AbstractElement {

    private By shareEmailLocator = By.xpath("//a[@class='button is-block js-email-form-toggle ac-share-via-email']");

    public ShareViaEmailButton(){
        setWebElement(shareEmailLocator);
    }

}
