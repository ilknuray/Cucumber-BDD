Feature: US1015 rapor alma

  Scenario: TC19 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "DemoguruUrl" sayfasinda
    And kullanici 3 sn bekler
    When cerezleri onaylar.
    And "Company" sutunundaki tum degerleri yazdirir
    And sayfayi kapatir