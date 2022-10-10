
Feature: US1008 Herokuapp delete butonu testi
  @delete
  Scenario:TC12 herokuapp delete butonu calismali
    Given kullanici "HerokuAppUrl" sayfasinda
    And add element butonuna basar
    And delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    And delete butonunun gorunmedigini test eder
    And sayfayi kapatir