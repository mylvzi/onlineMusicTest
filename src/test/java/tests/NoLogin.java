package tests;

import common.Utils;
import org.openqa.selenium.By;

/**
 * 存放所有的“未登录状态”页面测试用例
 */
public class NoLogin extends Utils {
    public static String[] url = {
            "http://60.205.7.136:8080/list.html",
            "http://60.205.7.136:8080/loveMusic.html",
            "http://60.205.7.136:8080/upload.html"
    };

    public NoLogin() {
        super();
    }

    public void NoLoginTest() {
        System.out.println("开始进行未登录状态测试");
        for(String str : url) {
            driver.get(str);
            driver.findElement(By.cssSelector("#user"));
            driver.findElement(By.cssSelector("#password"));

            System.out.println(str + "  页面验证成功!");
        }
    }


}
