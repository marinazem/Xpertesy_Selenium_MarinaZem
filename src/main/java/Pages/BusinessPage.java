package Pages;

public class BusinessPage extends BasePage{

    public static final String BUSINESS_PAGE_OPTION = "//*[text()=' digest your online meeting']";

    public boolean isPageTextVisible(){
        return elementExists(BUSINESS_PAGE_OPTION);
    }

}