package ActionDriver;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Slf4j
public class DriverAction {
    private int DURATION_WAIT_FOR_ELEMENT_IN_SECONDS = 30;
    private AppiumDriver driver;

    public DriverAction(AppiumDriver driver){
        this.driver = driver;
    }

    public DriverAction switchToWebView(){
        int time = 0;
        while (time < DURATION_WAIT_FOR_ELEMENT_IN_SECONDS){
            time++;
            if (driver.getContextHandles().size() < 2){
                log.info("Context still WEBVIEW");
            }
            else {
                break;
            }
        }
        log.info("Context now NATIVE_APP");

        //Також мє ще таке рішення як можна очікувати на зміну contex
//        try {
//            Wait().until(webDriver -> (iosDriver.getContextHandles().size() > 1));
//        } catch (TimeoutException e) {
//            throw new TimeoutException("There was no WebView in context!");
//        }

        Set<String> contextNames = driver.getContextHandles();
        List<String> handlesList = new ArrayList<>(contextNames);
        String webView = handlesList.get(1);
        driver.context(webView);
        return this;
    }

    public DriverAction switchToNativeApp(){
        driver.context("NATIVE_APP");
        return this;
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
        WebDriverWait wait = new WebDriverWait(driver, DURATION_WAIT_FOR_ELEMENT_IN_SECONDS);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(isVisible -> ExpectedConditions.visibilityOfElementLocated(element));
        return this;
    }
}
