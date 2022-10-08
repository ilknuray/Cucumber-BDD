
  Feature: US1003 kullanici parametre kullanarak arama yapabilmeli
    @parametre
    Scenario: TC07 kullanici parametre ile amazonda arama yapabilmeli
      Given kullanici amazon anasayfasina gider
      And kullanici "Nutella" aratir
      And arama sonuclarinin "Nutella" icerdegini test eder
      Then sayfayi kapatir