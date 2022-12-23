import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import static Pages.LoginPage.driver;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() throws IOException {
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        mainPage.captureElement(mainPage.isLogoVisible2(),"Logo_img");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() throws IOException {
        logger.info("Contact Us page load test");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        mainPage.takeScreenshot("ContactUsPageTest");
        mainPage.captureElement(mainPage.contactUsTabCapture(),"Contact_Us_img");
        assertTrue(isLoaded);
    }

    @Test
    public void openBusinessPage() throws IOException {
        logger.info("Business page load test");
        BusinessPage businessPage = mainPage.openBusinessTab();
        boolean isExist = businessPage.isPageTextVisible();
        mainPage.takeScreenshot("BusinessPageTest");
        mainPage.captureElement(mainPage.businessTabCapture(),"Business_img");
        assertTrue(isExist);
    }

    @Test
    public void openEducationPage() throws IOException {
        logger.info("Education page load test");
        EducationPage educationPage = mainPage.openEducationTab();
        boolean isPresent = educationPage.isPageTextPresent();
        mainPage.takeScreenshot("EducationPageTest");
        mainPage.captureElement(mainPage.educationTabCapture(),"Education_img");
        assertTrue(isPresent);
    }



      @Test
      public void openFamilyPage() throws IOException {
        logger.info("Family page load test");
        FamilyPage familyPage = mainPage.openFamilyTab();
        boolean isThere = familyPage.isPageTextVisible();
        mainPage.takeScreenshot("FamilyPageTest");
        mainPage.captureElement(mainPage.familyTabCapture(),"Family_img");
        assertTrue(isThere);
    }





}





