
  Feature: US1010 youtube test edildi
    Scenario: TC14 Youtube da muzik dinleyebilmeli
      Given kullanici "YoutubeUrl" sayfasinda
      And kullanici cerezleri kabul eder
      Then kullanici istedigi sarkiyi aratir
      And kullanici sarkiya tiklar
      And reklami gecer
      And sayfayi tam ekran yapar
      And kullanici "15" sn bekler
     # And sayfayi kapatir

