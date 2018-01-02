package pages;

import elements.advocateSharePage.ShareByLinkButton;
import elements.advocateSharePage.ShareViaEmailButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvocateShareFrame extends AbstractTalkableFrame{

    private By iFrameLocator = By.xpath("//iframe[@name='talkable-offer-iframe']");

    private WebElement pageIdentificator;//

    ////    Elements on the iframe:
    private ShareViaEmailButton shareViaEmailButton;
    private ShareByLinkButton shareByLinkButton;




    public AdvocateShareFrame(){
        setiFrameElement(iFrameLocator);
        switchToIFrame();

        //initialization of elements:
        shareViaEmailButton = new ShareViaEmailButton();
        shareByLinkButton = new ShareByLinkButton();

    }

    public void shareByLink(){

    }

    private void isPageOpened(){

    }
}
