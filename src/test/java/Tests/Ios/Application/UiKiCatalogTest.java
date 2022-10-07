package Tests.Ios.Application;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Ios.uikitcatalog.DataPickerPage;
import Pages.Ios.uikitcatalog.ToolBarsPage;
import Pages.Ios.uikitcatalog.UiKitCatalogStartPage;
import Pages.Ios.uikitcatalog.WebViewPage;
import Pages.Ios.uikitcatalog.toolbars.TintedPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;
import static Texts.WebViewText.*;

public class UiKiCatalogTest extends BaseClass {

    @BeforeMethod
    public void setup() {
        BaseClass.setupIosApplicationOnLocalhost(Devices.IPHONE_13_PRO_MAX(), UIKITCATALOG_IOS_APP_PATH);
    }

    @Test
    public void setValueOnDataWheel() {
        new UiKitCatalogStartPage(iosDriver)
                .clickDatePickerButton();

        new DataPickerPage(iosDriver)
                .setDayHoursMinutes();
    }

    @Test
    public void saveToFiles() {
        new UiKitCatalogStartPage(iosDriver)
                .scrollToToolBarButton()
                .clickToolBarButton();

        new ToolBarsPage(iosDriver)
                .clickTintedButton();

        new TintedPage(iosDriver)
                .shareButtonClick()
                .swipe()
                .saveToFilesButtonClick()
                .onMyIphoneButtonClick()
                .downloadsButtonClick()
                .saveButtonClick();
    }

    @Test
    public void switchToWebView() {
        new UiKitCatalogStartPage(iosDriver)
                .scrollToWebViewButton()
                .clickWebViewButton();

        new WebViewPage(iosDriver)
                .assertText(wkWebViewName);
    }
}
