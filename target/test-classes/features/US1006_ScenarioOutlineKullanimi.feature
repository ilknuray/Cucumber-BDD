
#amazon sayfasina gidip sirasiyla nutella,java,elma,armut aratip
  #sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

  Feature: US1007 kullanici amazonda istedigi kelimeleri aratir
    Scenario Outline: TC10 amazon listesindeki alementleri aratma
      Given kullanici "amazonUrl" sayfasinda
      Then kullanici "<istenenKelime>" aratir
      And arama sonuclarinin "<istenenKelimeKontrol>" icerdegini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella             |
      |java         |java                |
      |elma         |elma                |
      |armut        |armut               |
