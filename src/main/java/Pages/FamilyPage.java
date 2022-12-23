package Pages;

public class FamilyPage extends BasePage{

    public static final String FAMILY_PAGE_OPTION = "//*[contains(text(),'video conference')]";

    public boolean isPageTextVisible(){
        return elementExists(FAMILY_PAGE_OPTION);
    }

}

