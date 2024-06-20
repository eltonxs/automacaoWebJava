package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
    public static void takeScreenshot(WebDriver driver, String fileName) {
        File directory = new File("src/test/resources/Features/evidencias/");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(directory + "/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
