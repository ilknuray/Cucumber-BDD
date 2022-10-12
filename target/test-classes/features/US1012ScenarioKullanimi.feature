Feature: US1012 scenario outline kullanimi

  Scenario Outline: T016 Configreaeder ile scenario outline kullanimi
    Given kullanici "<istenenUrl>" sayfasinda
    Then kullanici 3 sn bekler
    And  url in "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenUrl     | istenenKelime |
      | amazonUrl      | amazon        |
      | facebookUrl    | facebook       |
      | HepsiBuradaUrl | hepsiburada   |
      | YoutubeUrl     | youtube       |
