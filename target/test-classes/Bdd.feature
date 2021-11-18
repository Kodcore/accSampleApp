#Language:pt-br
Feature: as a user I want ... to....

    Scenario: EnterVehicleData
      Given tab EnterVehicleData
      When fill form
      Then EnterInsurantDataPage open

      Scenario: EnterInsurantData
        Given tab EnterInsurantData
        When fill form
        Then EnterProductDataPage open

  Scenario: EnterProductData
    Given tab EnterProductData
    When fill form
    Then SelectPriceOptionPage open

    Scenario: SelectPriceOption
      Given tab SelectPriceOption
      When fill form
      Then AbaSendQuote open

      Scenario: SendQuote
        Given tab SendQuote
        When fill form
        Then show message "Sending e-mail sucess!"
