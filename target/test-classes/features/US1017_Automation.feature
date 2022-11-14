
  Feature:US1017 Kullanici register yapabilmeli
    @auto
    Scenario: Kullanici uygun datalarla register yapabilmeli
      Given kullanici "AtomationExcerciseUrl" sayfasinda
      And kullanici sign in linkine tiklar
      And kullanici Create and account bolumune email adresi girer
      And Create your account butonuna tiklar
      And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
      And kullanici Register butonuna basar
      Then kullanicinin hesap olusturuldugunu dogrulayin