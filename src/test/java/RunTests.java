import tests.*;

import java.io.IOException;

public class RunTests {
    public static void main(String[] args) throws InterruptedException, IOException {
        LoginTest loginTest = new LoginTest();
        loginTest.LoginRight();
        loginTest.LoginSubmitRight();
//        loginTest.LoginSubmitError1();
//        loginTest.LoginSubmitError2();
//        loginTest.LoginSubmitError3();


//        ListTest listTest = new ListTest();
//        // listTest.ListLoginTest();
//        listTest.playMusicTest();

        // UploadTest uploadTest = new UploadTest();
        // uploadTest.uploadNonMP3();
        // uploadTest.uploadMp3Test();
//        NoLogin noLogin = new NoLogin();
//        noLogin.NoLoginTest();

        LovemusicTest lovemusicTest = new LovemusicTest();
        lovemusicTest.lovemusicTestUI();
        lovemusicTest.lovemusicFunTest();
    }
}
