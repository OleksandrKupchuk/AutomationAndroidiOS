package ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class DriverAction {
    private int DURATION_WAIT_FOR_ELEMENT = 60000;
    private IOSDriver iosDriver;
    private AndroidDriver androidDriver;
    private AppiumDriver driver;

    public DriverAction(AppiumDriver driver){
        this.driver = driver;
    }

    public DriverAction scrollToObject(int number){
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", Integer.toString(number));
        driver.executeScript("mobile:scroll", scrollObject);
        return this;
    }

    public DriverAction scrollToObject(WebElement element){
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", element.getText());
        driver.executeScript("mobile:scroll", scrollObject);
        return this;
    }

    public DriverAction waitForElement(By element){
        WebDriverWait wait = new WebDriverWait(driver, DURATION_WAIT_FOR_ELEMENT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return this;
    }
}
