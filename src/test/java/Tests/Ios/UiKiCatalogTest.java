package Tests.Ios;

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
        BaseClass.setupApplication(Devices.IPHONE_13_PRO_MAX(UIKITCATALOG_IOS_APP_PATH));
    }

//    @SneakyThrows
//    @Test
//    public void findInformationInBrowser() {
//        iosDriver.get("https://www.google.com.ua");
//        WebElement searchInGoogle = iosDriver.findElement(By.name("q"));
////        searchInGoogle.click();
//        searchInGoogle.sendKeys("Automation");
////        driver.getKeyboard().sendKeys("Automation");
////        driver.getKeyboard().sendKeys(Keys.ENTER);
////        driver.getKeyboard().pressKey(Keys.ENTER);
////        searchInGoogle.sendKeys(Keys.ENTER);
//        Thread.sleep(5000);
//    }

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
