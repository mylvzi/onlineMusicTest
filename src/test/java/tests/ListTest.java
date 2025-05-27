package tests;

import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListTest extends Utils {
    public static String url = "http://60.205.7.136:8080/list.html";
    public ListTest() {
        super();
    }

    /**
     * 登录状态List页面测试
     */
    public void ListLoginTest() {
        driver.get(url);

        String expectedTitle = driver.getTitle();
        assert expectedTitle.equals("在线音乐服务器");

        driver.findElement(By.cssSelector("#exampleInputName2"));// 判断有没有这个输入框

        System.out.println("登录状态List页面验证成功");
    }

    /**
     * List页面测试-能否点击音乐播放
     */
    public void playMusicTest() throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
        WebElement playMusic = driver.findElement(By.cssSelector("#body > div:nth-child(2) > div > div > div.big-play-btn > a"));
        playMusic.click();


        Thread.sleep(10000);
    }


}
