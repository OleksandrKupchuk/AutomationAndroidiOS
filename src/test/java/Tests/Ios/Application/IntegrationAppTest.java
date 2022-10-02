package Tests.Ios.Application;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Ios.IntegrationApp.AlertPage;
import Pages.Ios.IntegrationApp.AttributesPage;
import Pages.Ios.IntegrationApp.IntegrationAppStartPage;
import Pages.Ios.IntegrationApp.ScrollingPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Data.AppPath.*;

public class IntegrationAppTest extends BaseClass {

    @BeforeMethod
    public void setup() {
        BaseClass.setupApplication(Devices.IPHONE_13_PRO_MAX_APP(INTEGRATION_IOS_APP_PATH));
    }

    @Test
    public void setValueInTextField(){
        new IntegrationAppStartPage(iosDriver)
                .clickAlertButton();

        new AlertPage(iosDriver)
                .setValueOnTextField("automation");
    }

    @Test
    public void scrollDown(){
        int number = 21;

        new IntegrationAppStartPage(iosDriver)
                .clickScrollingButton();

        new ScrollingPage(iosDriver)
                .clickTableViewButton()
                .scrollToNumber(number)
                .clickOnNumber(number);
    }

    @Test
    public void setValueOnSlider(){
        String value = "0.85";

        new IntegrationAppStartPage(iosDriver)
                .clickAttributesButton();

        new AttributesPage(iosDriver)
                .setValueOnSlider(value)
                .clickBackButton();
    }
}
