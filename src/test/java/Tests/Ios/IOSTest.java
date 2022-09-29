package Tests.Ios;

import Pages.Ios.*;
import Pages.Ios.IntegrationApp.AlertPage;
import Pages.Ios.IntegrationApp.AttributesPage;
import Pages.Ios.IntegrationApp.IntegrationAppStartPage;
import Pages.Ios.IntegrationApp.ScrollingPage;
import Pages.Ios.uikitcatalog.DataPickerPage;
import Pages.Ios.uikitcatalog.ToolBarsPage;
import Pages.Ios.uikitcatalog.UiKitCatalogStartPage;
import Pages.Ios.uikitcatalog.toolbars.TintedPage;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IOSTest extends BaseIos {

    @SneakyThrows
    @Test
    public void findInformationInBrowser() {
        iosDriver.get("https://www.google.com.ua");
        WebElement searchInGoogle = iosDriver.findElement(By.name("q"));
//        searchInGoogle.click();
        searchInGoogle.sendKeys("Automation");
//        driver.getKeyboard().sendKeys("Automation");
//        driver.getKeyboard().sendKeys(Keys.ENTER);
//        driver.getKeyboard().pressKey(Keys.ENTER);
//        searchInGoogle.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

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
