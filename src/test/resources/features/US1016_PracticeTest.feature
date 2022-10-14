Feature: US1016

  Scenario: TC20 clikc and keys

    Given kullanici "HerUrl" sayfasinda
    When 50 defa click me ye tiklayin
    And 50 defa Space dugmesine basin
    And Down yazisindaki iki basamakli sayilarin hepsini toplayin
    And Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin
    Then sonucun 1100 oldugunu dogrulayin
    #And sayfayi kapatir