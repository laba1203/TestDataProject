package elements;

import org.openqa.selenium.By;



public class FirstName extends AbstractElement{
    private By byLocator = By.xpath("//input[@id='affiliate_member_first_name']");


    public FirstName(){
//        setWebElement(By.xpath("//input[@id='affiliate_member_first_name']"));//By.cssSelector("input#affiliate_member_first_name"));
        setWebElement(byLocator);
    }

}
