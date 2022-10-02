package Pages.Ios.uikitcatalog;

import ActionDriver.DriverAction;
import Base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class WebViewPage extends BaseClass {

    private IOSDriver driver;
    private DriverAction driverAction;

    public WebViewPage(IOSDriver driver){
        this.driver = driver;
        driverAction = new DriverAction(driver);
    }

//    private By wkWebViewText = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"WKWebView\"]");
    private By wkWebViewText = MobileBy.AccessibilityId("This is HTML content inside a");

    public WebViewPage assertText(String text){
        driverAction.waitForElement(wkWebViewText);
        String textOnPage = driver.findElement(wkWebViewText).getText();
        Assert.assertEquals(textOnPage, text);
        return this;
    }
}
