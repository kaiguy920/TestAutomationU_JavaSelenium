package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class ResetPasswordTests extends BaseTests {
    @Test
    public void testSuccessfulPasswordReset(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickRetrievePassword();
        forgotPasswordPage.sendEmail("test@test.com");
        SecureAreaPage secureAreaPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(secureAreaPage.getErrorText().contains("Internal Server Error"), "Error not received");

    }
}
