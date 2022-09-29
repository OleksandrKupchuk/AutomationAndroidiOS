package Tests.Ios;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Ios.uikitcatalog.DataPickerPage;
import Pages.Ios.uikitcatalog.ToolBarsPage;
import Pages.Ios.uikitcatalog.UiKitCatalogStartPage;
import Pages.Ios.uikitcatalog.toolbars.TintedPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;

public class UiKiCatalogTest extends BaseClass {

    @BeforeMethod
    public void setup() {
        BaseClass.setup(Devices.IPHONE_13_PRO_MAX_APP(UIKITCATALOG_IOS_APP_PATH));
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
    public void saveToFiles() throws InterruptedException {
        new UiKitCatalogStartPage(iosDriver)
                .scrollToToolBarButton()
                .clickToolBarButton();

        new ToolBarsPage(iosDriver)
                .clickTintedButton();

        new TintedPage(iosDriver)
                .shareButtonClick()
                .swipe()
                .saveToFilesButtonClick()
//                .onMyIphoneButtonClick()
                .downloadsButtonClick()
                .saveButtonClick();
    }
}
