package tests;

import common.Utils;
import org.openqa.selenium.By;

import java.io.IOException;

public class LovemusicTest extends Utils {
    public static String url = "http://60.205.7.136:8080/loveMusic.html";
    public LovemusicTest() {
        super();
    }

    /**
     * 收藏音乐界面测试
     */

    public void lovemusicTestUI() {
        driver.get(url);

        driver.findElement(By.cssSelector("#info > tr > td:nth-child(4) > button"));
        String expectedText = driver.findElement(By.cssSelector("body > div.container > h3")).getText();
        assert expectedText.equals("我喜欢的音乐列表");

        System.out.println("收藏音乐界面UI测试成功");
    }

    /**
     * 收藏音乐界面--功能测试
     *
     */
    public void lovemusicFunTest() throws IOException, InterruptedException {
        // 1.判断搜索功能是否正确
        driver.findElement(By.cssSelector("#exampleInputName2")).sendKeys("无能为力");
        driver.findElement(By.cssSelector("#submit1")).click();
        System.out.println("收藏页面--搜索功能正常");
        getScreenShot("lovemusicFunTest");

        // 2.判断能否回到首页
        driver.findElement(By.cssSelector("body > div.container > div:nth-child(3) > a")).click();
        String expectedTitle = driver.getTitle();
        assert expectedTitle.equals("在线音乐服务器");
        Thread.sleep(2000);

        getScreenShot("lovemusicFunTest");
        System.out.println("收藏页面--回到首页功能正常");
        driver.quit();
    }
}
