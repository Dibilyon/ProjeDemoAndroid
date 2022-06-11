package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class autoReceiveOSver
{
    static String getPlatformVersion() {
        String devicever ="";
        String shellCommand = "adb shell getprop ro.build.version.release";

        try {
            ProcessBuilder builder= new ProcessBuilder("open", "-n", "/Applications/Utilities/Terminal.app",shellCommand);
            Process prc = builder.start();
            BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            devicever = output.readLine();
            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return devicever;
    }
}
