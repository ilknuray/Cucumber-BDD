Feature: US1011 Kullanici cdiscount sitesine uye olmadan alisveris yapar

  Scenario:TC15 Kullanici uye olmadan cdiscount sitesinden alisveris yapar
    Given kullanici "cdiscountUrl" sayfasinda
    And kullanici cerezleri onaylar
    And kullanici arama kutusuna bilgisayar yazar
    And kullanici cikan ilk urunu secer
    And kullanici urunu sepete ekler
    And kullanici tekar siteye doner
    And kullanici arama kutusuna telefon yazar
    Then ikinci urunu tiklar
    And sepete ekler
    And kullanici sepete gider
    And kullanici sepeti siler
      #And sayfayi kapatir


