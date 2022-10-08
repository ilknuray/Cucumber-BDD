@wip
  Feature: US1002 Kullanici ortak adimlari Backround ile calistirir
    Background: ortak adim
      Given kullanici amazon anasayfasina gider

      Scenario: TC05 amazon nutella arama
        And  kullanici nutella aratir
        And arama sonuclarini test eder
        And sayfayi kapatir

        Scenario: TC06 amazon java arama
          And kullanici java aratir
          And arama sonuclarini java test eder
          And sayfayi kapatir