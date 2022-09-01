package Pages.Android.Scanner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ScannerStartPage {

    AppiumDriver driver;
    public ScannerStartPage(AppiumDriver driver){
        this.driver = driver;
    }

    private By menu = MobileBy.AccessibilityId("Сканер QR і штрих-коду");

    public ScannerStartPage clickOnMenu(){
        driver.findElement(menu).click();
        return this;
    }
}
