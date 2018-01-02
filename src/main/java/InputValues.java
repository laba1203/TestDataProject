public class InputValues {
    private String siteLink;
    private int iterationCount;

    public void setVariables(String siteLink, int iterationCount){
        this.siteLink = siteLink;
        this.iterationCount = iterationCount;
        System.out.println("siteLink and iterationCount have been provided");
    }

    public int getIterationCount() {
        return iterationCount;
    }

    public String getSiteLink() {
        return siteLink;
    }
}
