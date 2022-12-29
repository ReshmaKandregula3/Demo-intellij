Feature: Login
  Scenario Outline:
    Given Go to demoqa.com "<Username>" and "<Pswd>"
    When Click On TextBox "<FullName>" "<Email>" "<CurrAdd>" "<PermAdd>"
#    Then Click On TextBox "<FullName>" "<Email>" "<CurrAdd>" "<PermAdd>"
    Examples:
#    2D with HEADERS
      | Username |        Pswd       |      FullName   |         Email     |            CurrAdd               |              PermAdd             |
      |   Reshu  |  Connecting#123   |Reshma Kandregula|reshma234@gmail.com|Ravi paradise, Kundalahalli Colony|Ravi paradise, Kundalahalli Colony|
    Then Go to Frames








