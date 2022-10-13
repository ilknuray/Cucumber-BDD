
Feature: US1015 classwork
  Scenario: TC19 delete butonu test edilir
Given kullanici "HerokuAppUrl" sayfasinda
When “Add Element” butona basin
And “Delete” butonu gorunur oluncaya kadar bekleyin
Then “Delete” butonunun gorunur oldugunu test edin
And Delete butonuna basarak butonu silin
Then Delete butonunun gorunmedigini test edin


