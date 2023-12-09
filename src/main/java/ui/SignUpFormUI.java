package ui;

import org.openqa.selenium.By;

public class SignUpFormUI {
    public static By signUpForm = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[1]/div[2]");
    public static By fullName = By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By email = By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public static By termsCheck = By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");
    public static By signUpButton = By.id("ctl00_MainContent_SignupControl1_ButtonSignup");
    public static By logoutButton = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");
}
