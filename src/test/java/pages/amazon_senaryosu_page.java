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
    public WebElement cookieButton;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement loginBar;
    @FindBy(xpath = " //input[@id='ap_email']")
    public WebElement loginEmail;
    @FindBy(xpath = " //span[@id='continue']")
    public WebElement emailButton;
    @FindBy(xpath = " //input[@id='ap_password']")
    public WebElement loginPassword;
    @FindBy(xpath = " //input[@id='signInSubmit']")
    public WebElement passwordButton;
    @FindBy(xpath = " //span[@class='nav-text' and contains(text(),'Şu ürünler için alışverişe devam edin:')]")
    public WebElement loginControl;
    @FindBy(xpath = " //span[@class='nav-line-2 ']")
    public WebElement hesabim;
    @FindBy(xpath = " //img[@alt='Listeleriniz']")
    public WebElement listeler;

    @FindBy(xpath = " //div[@class='a-section a-spacing-none a-padding-none aok-float-right aok-inline-block aok-align-center']")
    public WebElement listeDahaFazla;
    @FindBy(xpath = " //a[@id='editYourList']")
    public WebElement listeYonet;
    @FindBy(xpath = "//div[@id='list-settings-container']/span[@class='a-declarative']")
    public WebElement listeSil;
    @FindBy(xpath = " //span[@id='list-delete-confirm']")
    public WebElement listeSilOnay;

    @FindBy(xpath = " //input[@class='a-button-input']")
    public WebElement listeOlustur;


    @FindBy(xpath = " //input[@id='list-name']")
    public WebElement listeAdiText;
    @FindBy(xpath = " //span[@class='a-button a-button-primary']")
    public WebElement listeOlusturButton;

    @FindBy(xpath = "  //select[@id='searchDropdownBox']")
    public WebElement tumKategoriler;
    @FindBy(xpath = "  //option[@value='search-alias=computers']")
    public WebElement bilgisayarKategori;
    @FindBy(xpath = "  //input[@id='nav-search-submit-button']")
    public WebElement araButton;
    @FindBy(xpath = "  //h1[contains(text(),'Bilgisayar')]")
    public WebElement araBilgisayarlar;
    @FindBy(xpath = "   //input[@id='twotabsearchtextbox']")
    public WebElement araUrun;
    @FindBy(xpath = "   (//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(),MSI)])[1]")
    public WebElement araUrunKontrol;
    @FindBy(xpath = "   //a[@class='s-pagination-item s-pagination-button' and text()=2]")
    public WebElement urunSayfaIki;

    @FindBy(xpath = "   //span[@class='s-pagination-item s-pagination-selected']")
    public WebElement urunSecilenSayfa;
    @FindBy(xpath = "   (//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
    public WebElement urunIki;
    @FindBy(xpath = "  //input[@id='add-to-wishlist-button-submit']")
    public WebElement urunListeyeEkle;
    @FindBy(xpath = "  //span[@id='huc-view-your-list-button']")
    public WebElement listeGoruntule;
    @FindBy(xpath = "  //h2[@class='a-size-base']/a[@class='a-link-normal']")
    public WebElement listeUrunKontrol;

    @FindBy(xpath = "  //div[@role='heading']")
    public WebElement listeEkranKontrol;
    @FindBy(xpath = "  //input[@aria-labelledby='createList-announce']")
    public WebElement listeSilmeKontrol;
    @FindBy(xpath = "  //a[@id='nav-item-signout']")
    public WebElement cikisYap;
    @FindBy(xpath = "  //h1[@class='a-spacing-small']")
    public WebElement cikisKontrol;

}
