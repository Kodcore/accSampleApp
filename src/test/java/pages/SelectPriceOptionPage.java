package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SelectPriceOptionPage extends BasePage{
    public SelectPriceOptionPage(WebDriver navegador) {
        super(navegador);
    }
    @Given("aba EnterProductData")
    public void aba_enter_product_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("preencher formulario")
    public void preencher_formulario() {
        // preencher campo de id=firstname

        // preencher campo de id=lastname

        // informar data de nascimento no campo id=birthdate

        // selecionar o value="Male" no campo de id=gendermale

        // preencher o campo id=streetaddress

        // selecionar value="United Kingdom" no campo de id=country

        // preencher campo id=zipcode

        // preencher campo id=city

        // selecionar no campo id=occupation value=Employee

        // marcar label id=skydiving

        // preencher campo id=website

        // clicar button id=nextenterproductdata

        throw new io.cucumber.java.PendingException();
    }
    @Then("SelectPriceOptionPage open")
    public void select_price_option_page_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
