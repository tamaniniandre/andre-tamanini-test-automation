
  Feature: Validate the sending of vehicle quote

    Scenario Outline: : Send vehicle insurant quote and validate the success message for price <Price Option>
      Given that entered vehicle entire data
      And entered insurant entire data
      And entered product entire data
      When selected the price option "<Price Option>"
      And entered the quote user information below
      |E-Mail                    |Username        |Password    |Confirm Password |
      |teste_accenture@teste.com |andre.tamanini  |Teste123456 |Teste123456      |
      Then should be shown the following success message "Sending e-mail success!"

      Examples:
        |Price Option |
        |Silver       |
      Examples:
        |Price Option |
        |Gold         |
      Examples:
        |Price Option |
        |Platinum     |
      Examples:
        |Price Option |
        |Ultimate     |