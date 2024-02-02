Feature: Amazon Senaryosu
  @color
  Scenario: Login
    Given Amazon sitesi açılır.
    And Ana sayfanın açıldığı kontrol edilir.
    And Çerez tercihlerinden Çerezleri kabul et seçilir.
    And Siteye login olunur.
    When Login işlemi kontrol edilir.