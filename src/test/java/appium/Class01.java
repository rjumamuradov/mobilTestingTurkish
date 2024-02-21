package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class01 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\rozym\\IdeaProjects\\mobilTestingTurkish\\src\\apps\\GestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        //desiredCapabilities.setCapability(key:"appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.findElementsById("com.davemac327.gesture.tool:id/addButton");
        //driver.findElements(By.id("com.davemac327.gesture.tool:id/addButton"));
        //xpath text ile
        driver.findElementByXPath("//*[@text='Add gesture']");

        //xpath index ile
        System.out.println("driver.findElementByXPath(\"(//android.widget.Button)[1]\").getText() = "
                + driver.findElementByXPath("(//android.widget.Button)[1]").getText());

        //xpath attribute
        driver.findElementByXPath("//android.widget.Button[@text='Add gesture']").click();
        //android.widget.Button[@text='Add gesture']  //xpath
        Thread.sleep(5000);
    }
}
