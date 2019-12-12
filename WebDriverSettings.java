package ua.comGoogle;

import com.sun.deploy.cache.Cache;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;




public class WebDriverSettings {

    public ChromeDriver driver;



    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua");

    }

    // a number within a range
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static String getRandomStringIn(String[] array) {
        return array[getRandomNumber(0, array.length - 1)];

             }


    @After
    public void close(){

        driver.quit();

    }
}
