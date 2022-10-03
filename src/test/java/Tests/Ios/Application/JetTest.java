package Tests.Ios.Application;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Ios.Jet.JetLoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;

public class JetTest extends BaseClass {

    //dsasdasdasd
    @BeforeMethod
    public void setup(){
        BaseClass.setupApplication(Devices.IPAD_9TH_GENERATION(JET_IOS_APP_PATH));
    }

    @Test
    public void verifySwitchToWebView(){
        String login = "seller";
        String password = "Password1!#";
        String otp = "0000";
        String pinCode = "1927";

        new JetLoginPage(iosDriver)
                .clickLoginButton()
                .switchToWebView()
                .setLoginField(login)
                .clickContinueLoginButton()
                .setPasswordField(password)
                .clickContinuePasswordButton()
                .setOtpField(otp)
                .clickContinueOtpButton()
                .switchToNativeApp()
                .setPin(pinCode);
    }
}
