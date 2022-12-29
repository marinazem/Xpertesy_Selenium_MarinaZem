package Pages;

public class ForOfficesPage extends BasePage{

    public static final String FOR_OFFICES_PAGE_OPTION = "//*[contains(text(),'Room in your Office')]";

    public boolean isPageTextVisible(){
        return elementExists(FOR_OFFICES_PAGE_OPTION);
    }
}
