package Pages.Ios.uikitcatalog.toolbars;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class TintedPage {
    IOSDriver driver;

    public TintedPage(IOSDriver driver){
        this.driver = driver;
    }

    private By shareButton = MobileBy.AccessibilityId("Share");
    private By saveToFilesButton = MobileBy.xpath("//XCUIElementTypeButton[@name=\"XCElementSnapshotPrivilegedValuePlaceholder\"]\n");
    private By onMyIphoneButton = MobileBy.AccessibilityId("On My iPhone");
//    private By onMyIphoneButton = MobileBy.xpath("//XCUIElementTypeOther[@name=\"Target View\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
    private By downloadsButton = MobileBy.AccessibilityId("Downloads");
    private By saveButton = MobileBy.AccessibilityId("Save");
    private By header = MobileBy.AccessibilityId("UIActivityContentView");

    public TintedPage shareButtonClick(){
        driver.findElement(shareButton).click();
        return this;
    }

    public TintedPage saveToFilesButtonClick(){
        driver.findElement(saveToFilesButton).click();
        return this;
    }

    public TintedPage scrollToButtonSaveToFiles(){
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "XCElementSnapshotPrivilegedValuePlaceholder");
        driver.executeScript("mobile:scroll", scrollObject);
        return this;
    }

    public TintedPage onMyIphoneButtonClick() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(onMyIphoneButton).click();
        Thread.sleep(2000);
        return this;
    }

    public TintedPage downloadsButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(downloadsButton).click();
        return this;
    }

    public TintedPage saveButtonClick(){
        driver.findElement(saveButton).click();
        return this;
    }

    @SneakyThrows
    public TintedPage swipe(){
        try{
            MobileElement headerElement = (MobileElement) driver.findElement(header);
            final int ANIMATION_TIME = 200;
            HashMap<String, Object> swipeObject = new HashMap<>();
            swipeObject.put("direction", "up");
            swipeObject.put("element", headerElement.getText());
            driver.executeScript("mobile:swipe", swipeObject);
            Thread.sleep(ANIMATION_TIME);
        }
        catch (Exception exception){
            System.out.println("Cant swipe element");
        }
        return this;
    }
}
