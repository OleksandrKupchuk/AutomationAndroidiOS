package Pages.Ios.Jet;

import ActionDriver.DriverAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class JetLoginPage {
    private IOSDriver driver;
    private DriverAction driverAction;

    public JetLoginPage(IOSDriver driver){
        this.driver = driver;
        driverAction = new DriverAction(driver);
    }

    private By loginButton = MobileBy.AccessibilityId("login-btn");
    private By loginField = By.id("login_loginField");
    private By continueLoginButton = By.id("submit-login");
    private By passwordField = By.id("password_passwordField");
    private By continuePasswordButton = By.id("submit-password");
    private By otpField = By.id("otp_otpField");
    private By continueOtpButton = By.id("submit-otp");
    private String pin = "num-";

    public JetLoginPage clickLoginButton(){
        driverAction.waitForElement(loginButton);
        driver.findElement(loginButton).click();
        return this;
    }

    public JetLoginPage switchToWebView(){
        driverAction.switchToWebView();
        return this;
    }

    public JetLoginPage setLoginField(String login){
        driverAction.waitForElement(loginField);
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public JetLoginPage clickContinueLoginButton(){
        driver.findElement(continueLoginButton).click();
        return this;
    }

    public JetLoginPage setPasswordField(String password){
        driverAction.waitForElement(passwordField);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public JetLoginPage clickContinuePasswordButton(){
        driver.findElement(continuePasswordButton).click();
        return this;
    }

    public JetLoginPage setOtpField(String otp){
        driverAction.waitForElement(otpField);
        driver.findElement(otpField).sendKeys(otp);
        return this;
    }

    public JetLoginPage clickContinueOtpButton(){
        driver.findElement(continueOtpButton).click();
        return this;
    }

    public JetLoginPage switchToNativeApp(){
        driverAction.switchToNativeApp();
        return this;
    }

    public JetLoginPage setPin(String pinCode){
        String[] numbers = pinCode.split("");
        for (String number : numbers) {
            driverAction.waitForElement(MobileBy.AccessibilityId(pin + number));
            driver.findElement(MobileBy.AccessibilityId(pin + number)).click();
        }
        return this;
    }
}
