package Pages;

public class EducationPage extends BasePage{

    public static final String EDUCATION_PAGE_OPTION = "//*[text()=' brings the future of taking notes']";

    public boolean isPageTextPresent(){
        return elementExists(EDUCATION_PAGE_OPTION);
    }


}