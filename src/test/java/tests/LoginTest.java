
package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginShouldSucceed() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
        extentTest.pass("Login test passed.");
    }
}
