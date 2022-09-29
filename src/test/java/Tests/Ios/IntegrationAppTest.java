package Tests.Ios;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Ios.BaseIos;
import Pages.Ios.IntegrationApp.AlertPage;
import Pages.Ios.IntegrationApp.AttributesPage;
import Pages.Ios.IntegrationApp.IntegrationAppStartPage;
import Pages.Ios.IntegrationApp.ScrollingPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegrationAppTest extends BaseIos {

    @BeforeTest
    public void setup() {
        String pathApp = "/Users/oleksandrkupchuk/Library/Developer/Xcode/DerivedData/WebDriverAgent-heluqzvshawyozhcvahmgwxcttfj/Build/Products/Debug-iphonesimulator/IntegrationApp.app";
        BaseClass.setup(Devices.IPHONE_13_PRO_MAX_APP(pathApp));
    }

//    @Test
//    public void setValueInTextField(){
//        new IntegrationAppStartPage(iosDriver)
//                .clickAlertButton();
//
//        new AlertPage(iosDriver)
//                .setValueOnTextField("automation");
//    }

    @Test
    public void scrollDown(){
        new IntegrationAppStartPage(iosDriver)
                .clickScrollingButton();

        new ScrollingPage(iosDriver)
                .clickTableViewButton()
                .scrollTo(21);
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
