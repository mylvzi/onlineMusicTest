package tests;

import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadTest extends Utils {
    public static String url = "http://60.205.7.136:8080/upload.html";
    public UploadTest() {
        super();
    }

    /**
     * 登录状态--上传非MP3
     * 不会跳转到list页面
     */

    public void uploadNonMP3() {
        driver.get(url);

        WebElement element = driver.findElement(By.cssSelector("body > div > form > label:nth-child(1) > input[type=file]"));
        File nonMusicFile = new File("E:\\23220919张梦琦.pptx");
        element.sendKeys(nonMusicFile.getAbsolutePath());

        driver.findElement(By.cssSelector("body > div > form > label:nth-child(2) > input[type=text]")).sendKeys("a");

        driver.findElement(By.cssSelector("body > div > form > input[type=submit]")).click();

        System.out.println("上传非MP3文件测试成功");
        driver.quit();
    }

    /**
     * 登录状态上传MP3文件
     * 直接跳转到list页面
     */
    public void uploadMp3Test() {
        driver.get(url);

        WebElement element = driver.findElement(By.cssSelector("body > div > form > label:nth-child(1) > input[type=file]"));
        File nonMusicFile = new File("E:\\song.mp3");
        element.sendKeys(nonMusicFile.getAbsolutePath());
        driver.findElement(By.cssSelector("body > div > form > label:nth-child(2) > input[type=text]")).sendKeys("a");
        driver.findElement(By.cssSelector("body > div > form > input[type=submit]")).click();

        // 跳转到list页面
        String expectedTitle = driver.getTitle();
        assert expectedTitle.equals("在线音乐服务器");
        System.out.println("上传MP3文件测试成功");
    }
}
