#Language:pt-br
Feature: Como usuário eu quero ... para....

    Scenario: EnterVehicleData
      Given aba EnterVehicleData
      When preencher formulario
      Then EnterInsurantDataPage open

      Scenario: EnterInsurantData
        Given aba EnterInsurantData
        When preencher formulario
        Then EnterProductDataPage open

  Scenario: EnterProductData
    Given aba EnterProductData
    When preencher formulario
    Then SelectPriceOptionPage open

    Scenario: SelectPriceOption
      Given aba SelectPriceOption
      When preencher formulario
      Then AbaSendQuote open

      Scenario: SendQuote
        Given aba SendQuote
        When preencher formulario
        Then show message "Sending e-mail sucess!"