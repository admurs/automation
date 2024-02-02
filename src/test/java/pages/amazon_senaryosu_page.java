package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class amazon_senaryosu_page {
    public amazon_senaryosu_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='nav-logo-link nav-progressive-attribute']")
    public WebElement mainLogo;
    @FindBy(xpath = "//input[@class='a-button-input celwidget']")
    public  WebElement cookieButton;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public  WebElement loginBar;
    @FindBy(xpath = " //input[@id='ap_email']")
    public  WebElement loginEmail;
    @FindBy(xpath = " //span[@id='continue']")
    public  WebElement emailButton;
    @FindBy(xpath = " //input[@id='ap_password']")
    public  WebElement loginPassword;
    @FindBy(xpath = " //input[@id='signInSubmit']")
    public  WebElement passwordButton;
    @FindBy(xpath = " //span[@class='nav-text' and contains(text(),'Şu ürünler için alışverişe devam edin:')]")
    public  WebElement loginControl;
}
