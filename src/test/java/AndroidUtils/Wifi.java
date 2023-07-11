package AndroidUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Wifi {

	

    public static void enableAirplaneMode() {
        try {
            // Execute ADB command to enable Airplane mode
            Process process = Runtime.getRuntime().exec("adb shell settings put global airplane_mode_on 1");
            process.waitFor();

            // Execute ADB command to broadcast the Airplane mode change
            Process broadcastProcess = Runtime.getRuntime().exec("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true");
            broadcastProcess.waitFor();

            // Read the output from the command execution
            BufferedReader reader = new BufferedReader(new InputStreamReader(broadcastProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Airplane mode enabled successfully.");
            } catch (IOException | InterruptedException e) {
            e.printStackTrace();
           }
    }
        public static void disableAirplaneMode() throws IOException
        {
        	Process process1 = Runtime.getRuntime().exec("adb shell settings put global airplane_mode_on 0");
     
       try {
				process1.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
	     		e.printStackTrace();
			}
        }
        
        
        public static void wifi()
        {
        	   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
               // Set other desired capabilities as required

               // Initialize the Appium driver instance
               AppiumDriver driver = new AndroidDriver<>(desiredCapabilities);

               // Enable airplane mode using Appium script
               driver.executeScript("mobile: shell", "settings put global airplane_mode_on 1");
               driver.executeScript("mobile: shell", "am broadcast -a android.intent.action.AIRPLANE_MODE");

        }
    
}
