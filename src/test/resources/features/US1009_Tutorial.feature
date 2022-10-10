
  Feature: US1009 sayfada islemler yapma
    Scenario: TC13 sepette islem yapma
    Given kullanici "TutorialUrl" sayfasinda
    And Phones & PDAs'a tıklar
    Then Telefonların markalarını alır
    And Tüm öğeleri sepete ekler
    And Sepete tıklar
    And Sepetteki isimleri alır
    And Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırır