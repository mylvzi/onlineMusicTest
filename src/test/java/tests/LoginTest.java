package tests;

import common.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends Utils {
    public static String url = "http://60.205.7.136:8080/login.html";
    public LoginTest() {
        super();
    }

    // 检查是否加载成功
    public void LoginRight() {
        driver.get(url);
        // 检查是否有 user和 password
        driver.findElement(By.cssSelector("#user"));
        driver.findElement(By.cssSelector("#password"));
    }

    // 正常登录
    public void LoginSubmitRight() {
        driver.get(url);
        // 1.输入账号密码
        driver.findElement(By.cssSelector("#user")).sendKeys("bit");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#submit")).click();

        // 由于设置的有弹窗需要解决一下  alert只能通过显示等待获取
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // 2.检查url是否是/list
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
        assert expectedTitle.equals("在线音乐服务器");

        // 3.检查url是否是/list
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        assert currentUrl.equals("http://60.205.7.136:8080/list.html");

        // 4.检查是否含有list页面的“查询按钮”元素
        driver.findElement(By.cssSelector("#submit1"));// 如果找不到就会报异常

        // driver.quit();

    }

    /**
     * 登录失败测试--用户名/密码输入错误
     */
    public void LoginSubmitError1() throws InterruptedException {
        // 返回上一界面  因为上一个测试是“登录成功”，成功之后跳转到list界面了
        driver.navigate().back();
        driver.navigate().refresh();

        // Thread.sleep(3000);

        driver.findElement(By.cssSelector("#user")).sendKeys("bit1");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#submit")).click();

        // 由于设置的有弹窗需要解决一下  alert只能通过显示等待获取
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        assert text.equals("登录失败，密码或者用户名错误！");
        alert.accept();

        System.out.println("登录失败验证成功");
        // driver.quit();
    }

    /**
     * 登录失败测试--用户名 || 密码为空
     */
    public void LoginSubmitError2() throws InterruptedException {
        // 刷新  重新输入
        driver.navigate().refresh();

        // Thread.sleep(3000);

        driver.findElement(By.cssSelector("#user")).sendKeys("");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#submit")).click();

        // 由于设置的有弹窗需要解决一下  alert只能通过显示等待获取
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        assert text.equals("用户名或者密码不能为空！");
        alert.accept();

        System.out.println("登录失败验证成功");
        // driver.quit();
    }

    /**
     * 登录失败测试--检查是否存在sql注入问题  弹出"登录失败，密码或者用户名错误！"
     */
    public void LoginSubmitError3() throws InterruptedException {
        // 刷新  重新输入
        driver.navigate().refresh();

        // Thread.sleep(3000);

        driver.findElement(By.cssSelector("#user")).sendKeys("admin' -- ");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#submit")).click();

        // 由于设置的有弹窗需要解决一下  alert只能通过显示等待获取
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        assert text.equals("登录失败，密码或者用户名错误！");
        alert.accept();

        System.out.println("sql注入验证成功");

        // driver.quit();
    }



}
