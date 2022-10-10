

  Feature: US1007 kullanici data ekleyebilmeli

    Scenario Outline: TC11 kullanici istedigi datalari ekleyebilir
      Given kullanici "EditorUrl" sayfasinda
      Then "new" butonuna basar
      And isim bolumune "<isim>" girer
      And soyisim bolumune "<soyisim>" girer
      And position bolumune "<position>" girer
      And ofis bolumune "<ofis>" yazar
      And extension bolumune "<extension>" yazar
      And srartDate bolumune "<startDate>" yazar
      And salary bolumune "<salary>" yazar
      And "create" tusuna basar
      When kullanici "<isim>" ile arama yapar
      And isim bolumunde "<isim>" oldugunu dogrular
      And sayfayi kapatir

      Examples:
      |isim|soyisim|position|ofis|extension|startDate|salary|
      |Alim|Alim   |qa      |ankara|UI     |2021-10-11|10000|
      |Berk|Can    |tester  |ankara|api    |2021-03-10|15000|
      |huseyin|Kacmaz|BA    |berlin|-      |2022-02-09|40000|

