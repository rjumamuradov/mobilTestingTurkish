package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Appium02 {


    @Test
     public void test01() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we can write  3 different ways as below
        //https://appium.io/docs/en/writing-running-appium/caps/  explaniation on official site

        //desiredCapabilities.setCapability("platformName","Android");
        // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        //defind device
       // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\rozym\\IdeaProjects\\mobilTestingTurkish\\src\\apps\\GestureTool.apk");
        //cmd->adb devices
        //cmd->adb shell->dumpsys window | grep -E "mCurrentFocus"-> mCurrentFocus=Window{fb0a4aa u0 com.google.android.apps.nexuslauncher/com.google.android.apps.nexuslauncher.NexusLauncherActivity}
        desiredCapabilities.setCapability("appPackage","com.google.android.apps.nexuslauncher");
        desiredCapabilities.setCapability("appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.unlockDevice();


    }
}
