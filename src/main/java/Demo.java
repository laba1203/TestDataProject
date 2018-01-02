import pages.SitePage;

public class Demo {

//    public InputValues inputValues = new InputValues();

    public static void main(String[] args)
    {
        InputValues inputValues = new InputValues();
        inputValues.setVariables("http://learn.talkable.com/QA-Max/void/invite.html", 1);

        SitePage sitePage = new SitePage(inputValues.getSiteLink());
        try {
            sitePage.open();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        sitePage.firstName.sendKeys("Auto-test1");



    }

}
