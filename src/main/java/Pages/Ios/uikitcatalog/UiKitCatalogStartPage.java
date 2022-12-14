package Pages.Ios.uikitcatalog;

import ActionDriver.DriverAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UiKitCatalogStartPage {
    private IOSDriver driver;
    private DriverAction driverAction;

    public UiKitCatalogStartPage(IOSDriver driver){
        this.driver = driver;
        driverAction = new DriverAction(driver);
    }

    private By datePickerButton = MobileBy.AccessibilityId("Date Picker");
    private By toolBarButton = MobileBy.AccessibilityId("Toolbars");
    private By webViewButton = MobileBy.AccessibilityId("Web View");

    public UiKitCatalogStartPage clickDatePickerButton(){
        driver.findElement(datePickerButton).click();
        return this;
    }

    public UiKitCatalogStartPage scrollToToolBarButton(){
        WebElement parentButton = driver.findElement(By.xpath("//XCUIElementTypeTable"));
        List<WebElement> buttons = parentButton.findElements(By.xpath("//XCUIElementTypeCell"));
        WebElement toolBarsButton = buttons.get(16);

        driverAction.scrollToObject(toolBarsButton);
        return this;
    }

    public UiKitCatalogStartPage clickToolBarButton(){
        driver.findElement(toolBarButton).click();
        return this;
    }

    public UiKitCatalogStartPage scrollToWebViewButton(){
        WebElement parentButton = driver.findElement(By.xpath("//XCUIElementTypeTable"));
        List<WebElement> buttons = parentButton.findElements(By.xpath("//XCUIElementTypeCell"));
        WebElement webViewButton = buttons.get(buttons.size() - 1);
        driverAction.scrollToObject(webViewButton);
        return this;
    }

    public UiKitCatalogStartPage clickWebViewButton(){
        driver.findElement(webViewButton).click();
        return this;
    }
}
