package ua.comGoogle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class GoogleTest extends WebDriverSettings {


    @Test

    public void testRandomStringForTextField() throws IOException {
        String[] words = { "hello,", "cat,", "food", "buy", "free", "click",
                "here" };

        driver.findElement(By.className("gLFyf")).sendKeys(getRandomStringIn(words));
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.className("hsuHs")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
        System.out.println("the Screenshot is taken");




    }
}




