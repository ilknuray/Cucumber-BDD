@tumu

Feature: US1001 kullanici amazon anasayfasinda arama yapar

  @nutella
  Scenario: TC01 amazonda nutella arama
    Given kullanici amazon anasayfasina gider
    Then kullanici nutella aratir
    And arama sonuclarini test eder
    And sayfayi kapatir

  @java
  Scenario: TC02 amazonda java arama
    Given kullanici amazon anasayfasina gider
    Then kullanici java aratir
    And arama sonuclarini java test eder
    And sayfayi kapatir

  @iphone
  Scenario: TC03 Kullanici amazonda selenyum aratir
    Given kullanici amazon anasayfasina gider
    Then kullanici selenyumu aratir
    And sonuclarin selenyum icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 Kullanici iphone icin arama yapar
    Given kullanici amazon anasayfasina gider
    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir