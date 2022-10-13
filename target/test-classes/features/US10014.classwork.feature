Feature: US 1014 class calismasi

  Scenario Outline: TC18 isim bolumu dogrulama
    When kullanici "https://editor.datatables.net/" adresine gider
    Then new butonuna basar
    And "<firstname>" girer
    And "<lastname>" girer
    And "<position>" girer
    And "<office>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    Examples:
      | firstname | lastname | position | office |
      | fatih     | yilmaz   | qa       |        |
      | ilknur    | yilmaz   | qa       |        |
      | ayse      | fatma    | dev      |        |
      | melih     | senih    | dev ops  |        |
      #5farkli kullanici bilgisi girer


