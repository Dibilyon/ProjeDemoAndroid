package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class autoReceiveDevice
{
    static String getDeviceName() {
        String deviceName = "";
        String shellCommand = "adb get-serialno";
        String shellCommander = "adb shell getprop ro.build.version.release";
        try {
            ProcessBuilder builder = new ProcessBuilder("open", "-n", "/Applications/Utilities/Terminal.app",shellCommand,shellCommander);
            builder.redirectErrorStream(true);
            Process prc = builder.start();
            BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            deviceName = output.readLine();

            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deviceName;

    }
}
