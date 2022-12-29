package Pages;

import Consts.Consts;

import static Consts.Consts.*;

public class MainPage extends BasePage{
    private static final String LOGO_IMG = "//img [@src='images/logo.svg']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact Us']";
    private static final String BUSINESS_PAGE_OPTION = "//a[text()='Business']";
    private static final String EDUCATION_PAGE_OPTION = "//a[text()='Education']";
    private static final String FAMILY_PAGE_OPTION = "//a[text()='Family']";
    private static final String FOR_OFFICES_PAGE_OPTION = "//a[text()='for Offices']";



    public void navigateToMainPage(){

        webDriver.get(Consts.Home_Page_URL);
    }

    public boolean isLogoVisible(){
        Boolean isVisible =  elementExists(LOGO_IMG);
        return isVisible;
    }
    public String isLogoVisible2(){
        Boolean isVisible =  elementExists(LOGO_IMG);
        return LOGO_IMG;
    }

    public ContactUsPage openContactUsTab(){
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }
    public String contactUsTabCapture(){
        Boolean isVisible =  elementExists(CONTACT_US_OPTION);
        return CONTACT_US_OPTION;
    }

    public BusinessPage openBusinessTab(){
        clickElementByXpath(BUSINESS_PAGE_OPTION);
        return new BusinessPage();
    }
    public String businessTabCapture() {
        Boolean isVisible = elementExists(BUSINESS_PAGE_OPTION);
        return BUSINESS_PAGE_OPTION;
    }

    public EducationPage openEducationTab(){
        clickElementByXpath(EDUCATION_PAGE_OPTION);
        return new EducationPage();
    }
    public String educationTabCapture() {
        Boolean isVisible = elementExists(EDUCATION_PAGE_OPTION);
        return EDUCATION_PAGE_OPTION;
    }

    public FamilyPage openFamilyTab(){
        clickElementByXpath(FAMILY_PAGE_OPTION);
        return new FamilyPage();
    }
    public String familyTabCapture() {
        Boolean isVisible = elementExists(FAMILY_PAGE_OPTION);
        return FAMILY_PAGE_OPTION;
    }

    public ForOfficesPage openForOfficesTab(){
        clickElementByXpath(FOR_OFFICES_PAGE_OPTION);
        return new ForOfficesPage();
    }
    public String forOfficesTabCapture() {
        Boolean isVisible = elementExists(FOR_OFFICES_PAGE_OPTION);
        return FOR_OFFICES_PAGE_OPTION;
    }






}

