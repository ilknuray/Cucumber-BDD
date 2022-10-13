
Feature: US 1014 amazon test
  @amazonsignin
  Scenario: TC 18 amazon Sign in test
Given kullanici "amazonUrl" sayfasinda
When sign in butonuna tiklar
And faker kullanarak e-posta gonderir
And gonderdigi e-postanın ekran goruntusunu alir
And continiue'a tiklar
Then There was a problem mesajini dogrular
And Need help e tiklar
And forgot your password e tiklar
Then Password assistance metnini dogrular
And Geri gider
And Create your account butonuna tiklar
Then Create account metnini dogrular
And sayfayi kapatir