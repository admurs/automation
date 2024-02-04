package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.amazon_senaryosu_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class amazon_senaryosu_stepDef {
    amazon_senaryosu_page amazonsenaryosupage = new amazon_senaryosu_page();
    String ekleneUrunText;
    String listeUrunText;

    @io.cucumber.java.en.Given("Amazon sitesi açılır.")
    public void amazonSitesiAcılır() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
    }

    @io.cucumber.java.en.And("Ana sayfanın açıldığı kontrol edilir.")
    public void anaSayfanınAcıldıgıKontrolEdilir() {

        Assert.assertTrue(amazonsenaryosupage.mainLogo.isDisplayed());
    }

    @io.cucumber.java.en.And("Çerez tercihlerinden Çerezleri kabul et seçilir.")
    public void cerezTercihlerindenCerezleriKabulEtSecilir() {
        amazonsenaryosupage.cookieButton.click();
    }

    @io.cucumber.java.en.And("Siteye login olunur.")
    public void siteyeLoginOlunur() {
        amazonsenaryosupage.loginBar.click();
        amazonsenaryosupage.loginEmail.sendKeys("xx@xx.com");
        amazonsenaryosupage.emailButton.click();
        amazonsenaryosupage.loginPassword.sendKeys("xx");
        amazonsenaryosupage.passwordButton.click();

    }

    @io.cucumber.java.en.Then("Login işlemi kontrol edilir.")
    public void loginIslemiKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.loginControl.isEnabled());
    }

    @Given("Hesabım bölümünden “Virgosol Liste” isimli yeni bir liste oluşturulur.")
    public void hesabımBolumundenVirgosolListeIsimliYeniBirListeOlusturulur() {
        amazonsenaryosupage.hesabim.click();
        amazonsenaryosupage.listeler.click();
        amazonsenaryosupage.listeOlustur.click();
        amazonsenaryosupage.listeAdiText.clear();
        amazonsenaryosupage.listeAdiText.sendKeys("Virgosol Liste");
        ReusableMethods.bekle(1);
        amazonsenaryosupage.listeOlusturButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.")
    public void aramaButonuYanındakiKategorilerTabındanBilgisayarSecilir() {
        ReusableMethods.bekle(1);
        amazonsenaryosupage.tumKategoriler.click();
        ReusableMethods.bekle(1);
        amazonsenaryosupage.bilgisayarKategori.click();
        ReusableMethods.bekle(1);
        amazonsenaryosupage.araButton.click();
    }

    @Then("Bilgisayar kategorisi seçildiği kontrol edilir.")
    public void bilgisayarKategorisiSecildigiKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.araBilgisayarlar.isDisplayed());
    }

    @And("Arama alanına msi yazılır ve arama yapılır.")
    public void aramaAlanınaMsiYazılırVeAramaYapılır() {
        amazonsenaryosupage.araUrun.sendKeys("msi");
        amazonsenaryosupage.araButton.click();
    }

    @Then("Arama yapıldığı kontrol edilir.")
    public void aramaYapıldıgıKontrolEdilir() {
        amazonsenaryosupage.araUrunKontrol.isDisplayed();
    }

    @And("Arama sonuçları sayfasından 2. sayfa açılır.")
    public void aramaSonuclarıSayfasındanSayfaAcılır() {
        amazonsenaryosupage.urunSayfaIki.click();
    }

    @Then("2. sayfanın açıldığı kontrol edilir.")
    public void sayfanınAcıldıgıKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.urunSecilenSayfa.isEnabled());
    }

    @And("Sayfadaki 2. ürün oluşturulan “Virgosol Liste” listesine eklenir.")
    public void sayfadakiUrunOlusturulanVirgosolListeListesineEklenir() {
        ekleneUrunText = amazonsenaryosupage.urunIki.getText();
        amazonsenaryosupage.urunIki.click();
        ReusableMethods.bekle(1);
        amazonsenaryosupage.urunListeyeEkle.click();
    }

    @Then("2. Ürünün listeye eklendiği kontrol edilir.")
    public void urununListeyeEklendigiKontrolEdilir() {
        amazonsenaryosupage.listeGoruntule.click();
        listeUrunText = amazonsenaryosupage.listeUrunKontrol.getText();
        Assert.assertEquals(ekleneUrunText, listeUrunText);

    }

    @Given("Hesabım  Alışveriş Listesi sayfasına gidilir.")
    public void hesabımAlısverisListesiSayfasınaGidilir() {
        amazonsenaryosupage.hesabim.click();
        amazonsenaryosupage.listeler.click();
    }

    @And("Alışveriş Listesi sayfası açıldığı kontrol edilir.")
    public void alısverisListesiSayfasıAcıldıgıKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.listeEkranKontrol.isDisplayed());
    }

    @And("Eklenen ürün Virgosol Liste’sinden silinir.")
    public void eklenenUrunVirgosolListeSindenSilinir() {
        amazonsenaryosupage.listeDahaFazla.click();
        amazonsenaryosupage.listeYonet.click();
        ReusableMethods.bekle(1);
        amazonsenaryosupage.listeSil.click();
        ReusableMethods.bekle(1);
        amazonsenaryosupage.listeSilOnay.click();
    }

    @Then("Silme işleminin gerçekleştiği kontrol edilir.")
    public void silmeIslemininGerceklestigiKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.listeSilmeKontrol.isDisplayed());
    }

    @Given("Üye çıkış işlemi yapılır.")
    public void uyeCıkısIslemiYapılır() {
        ReusableMethods.hover(amazonsenaryosupage.loginBar);
        amazonsenaryosupage.cikisYap.click();
    }

    @Then("Çıkış işleminin yapıldığı kontrol edilir.")
    public void cıkısIslemininYapıldıgıKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.cikisKontrol.isDisplayed());
        Driver.quitDriver();
    }
}
