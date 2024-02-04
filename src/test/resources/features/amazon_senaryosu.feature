@all
Feature: Amazon Senaryosu

  Scenario: Login
    Given Amazon sitesi açılır.
    And Ana sayfanın açıldığı kontrol edilir.
    And Çerez tercihlerinden Çerezleri kabul et seçilir.
    And Siteye login olunur.
    Then Login işlemi kontrol edilir.

  Scenario: Liste oluşturma ve listeye ürün ekleme
    Given Hesabım bölümünden “Virgosol Liste” isimli yeni bir liste oluşturulur.
    And Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
    Then Bilgisayar kategorisi seçildiği kontrol edilir.
    And Arama alanına msi yazılır ve arama yapılır.
    Then Arama yapıldığı kontrol edilir.
    And Arama sonuçları sayfasından 2. sayfa açılır.
    Then 2. sayfanın açıldığı kontrol edilir.
    And Sayfadaki 2. ürün oluşturulan “Virgosol Liste” listesine eklenir.
    Then 2. Ürünün listeye eklendiği kontrol edilir.

  Scenario: Liste silme
    Given Hesabım  Alışveriş Listesi sayfasına gidilir.
    And Alışveriş Listesi sayfası açıldığı kontrol edilir.
    And Eklenen ürün Virgosol Liste’sinden silinir.
    Then Silme işleminin gerçekleştiği kontrol edilir.

  Scenario: Logout
    Given Üye çıkış işlemi yapılır.
    Then Çıkış işleminin yapıldığı kontrol edilir.