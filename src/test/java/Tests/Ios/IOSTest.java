package Tests.Ios;

import Pages.Ios.*;
import Pages.Ios.uikitcatalog.DataPickerPage;
import Pages.Ios.uikitcatalog.ToolBarsPage;
import Pages.Ios.uikitcatalog.UiKitCatalogStartPage;
import Pages.Ios.uikitcatalog.toolbars.TintedPage;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IOSTest extends BaseIos {

    @SneakyThrows
    @Test
    public void findInformationInBrowser() {
        driver.get("https://www.google.com.ua");
        WebElement searchInGoogle = driver.findElement(By.name("q"));
//        searchInGoogle.click();
        searchInGoogle.sendKeys("Automation");
//        driver.getKeyboard().sendKeys("Automation");
//        driver.getKeyboard().sendKeys(Keys.ENTER);
//        driver.getKeyboard().pressKey(Keys.ENTER);
//        searchInGoogle.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    @Test
    public void setValueInTextField(){
        new IntegrationAppStartPage(driver)
                .clickAlertButton();

        new AlertPage(driver)
                .setValueOnTextField("automation");
    }

    @Test
    public void scrollDown(){
        new IntegrationAppStartPage(driver)
                .clickScrollingButton();

        new ScrollingPage(driver)
                .clickTableViewButton()
                .scrollTo99()
                .clickOn99();
    }

    @Test
    public void setValueOnSlider(){
        String value = "0.85";

        new IntegrationAppStartPage(driver)
                .clickAttributesButton();

        new AttributesPage(driver)
                .setValueOnSlider(value)
                .clickBackButton();
    }

    @Test
    public void setValueOnDataWheel() {
        new UiKitCatalogStartPage(driver)
                .clickDatePickerButton();

        new DataPickerPage(driver)
                .setDayHoursMinutes();
    }

    @Test
    public void saveToFiles() throws InterruptedException {
        new UiKitCatalogStartPage(driver)
                .scrollToToolBarButton()
                .clickToolBarButton();

        new ToolBarsPage(driver)
                .clickTintedButton();

        new TintedPage(driver)
                .shareButtonClick()
                .swipe()
                .saveToFilesButtonClick()
//                .onMyIphoneButtonClick()
                .downloadsButtonClick()
                .saveButtonClick();
    }
}
