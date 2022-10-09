
  Feature: US1004 Kullanici parametre ile configuration file i kullanabilmeli
    @config
    Scenario: TC08 configurations properties sayfasindan parametre kullanimi
      Then  kullanici 3 sn bekler
      Given kullanici "rentalCar" sayfasinda
      And url in "blue" icerdigini test eder
      And sayfayi kapatir