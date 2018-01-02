package elements.advocateSharePage;

import elements.AbstractElement;
import org.openqa.selenium.By;

public class ShareByLinkButton extends AbstractElement {

    private By shareEmailLocator = By.xpath("//a[@class='button is-block is-link js-open-link-popup ac-share-via-link']");

    public ShareByLinkButton(){
        setWebElement(shareEmailLocator);
    }

}
