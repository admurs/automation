package stepDefinitions;

import org.testng.Assert;
import pages.amazon_senaryosu_page;
import utilities.ConfigReader;
import utilities.Driver;

public class amazon_senaryosu_stepDef {
    amazon_senaryosu_page amazonsenaryosupage = new amazon_senaryosu_page();

    @io.cucumber.java.en.Given("Amazon sitesi açılır.")
    public void amazonSitesiAcılır() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
    }

    @io.cucumber.java.en.And("Ana sayfanın açıldığı kontrol edilir.")
    public void anaSayfanınAcıldıgıKontrolEdilir() {

        amazonsenaryosupage.mainLogo.isDisplayed();
    }

    @io.cucumber.java.en.And("Çerez tercihlerinden Çerezleri kabul et seçilir.")
    public void cerezTercihlerindenCerezleriKabulEtSecilir() {
        amazonsenaryosupage.cookieButton.click();
    }

    @io.cucumber.java.en.When("Siteye login olunur.")
    public void siteyeLoginOlunur() {
        amazonsenaryosupage.loginBar.click();
        amazonsenaryosupage.loginEmail.sendKeys("admurs@gmail.com");
        amazonsenaryosupage.emailButton.click();
        amazonsenaryosupage.loginPassword.sendKeys("adem6224");
        amazonsenaryosupage.passwordButton.click();

    }

    @io.cucumber.java.en.And("Login işlemi kontrol edilir.")
    public void loginIslemiKontrolEdilir() {
        Assert.assertTrue(amazonsenaryosupage.loginControl.isEnabled());
    }
}
