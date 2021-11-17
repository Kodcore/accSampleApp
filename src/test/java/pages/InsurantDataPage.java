package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage extends BasePage{
    public InsurantDataPage(WebDriver navegador) {
        super(navegador);
    }

    @Given("aba EnterInsurantData")
    public String capturaTituloAbaInsurantData() {
        return navegador.findElement(By.id("enterinsurantdata")).getAttribute("name");

    }

    @When("preencher formulario")
    public InsurantDataPage enterName() {
        navegador.findElement(By.id("firstname")).sendKeys("John");
        navegador.findElement(By.id("lastname")).sendKeys("Walker");
        return this;}

    public InsurantDataPage enterDateOfBirth(){
        navegador.findElement(By.id("birthdate")).sendKeys("01/01/2000");
        return this;
    }

    public InsurantDataPage selectGender(){
        navegador.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span")).click();
                //(By.id("gendermale")).click();
        return this;
    }
    public InsurantDataPage enterStreetAddress(){
        navegador.findElement(By.id("streetaddress")).sendKeys("One Street");
        return this;
    }
    public InsurantDataPage selectCountry(){
        WebElement country = navegador.findElement(By.id("country"));
        new Select(country).selectByValue("Brazil");
        return this;
    }
    public InsurantDataPage enterZipCode(){
        navegador.findElement(By.id("zipcode")).sendKeys("555555");
        return this;
    }
    public InsurantDataPage enterCity(){
        navegador.findElement(By.id("city")).sendKeys("Veneza");
        return this;
    }

    public InsurantDataPage selectOccupation(){
       WebElement occupation = navegador.findElement(By.id("occupation"));
       new Select(occupation).selectByValue("Employee");
       return this;
    }

    public InsurantDataPage checkHobbies(){
        navegador.findElement(By.cssSelector("#cliffdiving")).click();
        navegador.findElement(By.cssSelector("#skydiving")).click();
        navegador.findElement(By.id("other")).click();
        return this;
    }
    public InsurantDataPage enterWebsite(){
        navegador.findElement(By.id("website")).sendKeys("https://google.com");
        return this;
    }
    public InsurantDataPage enterPictureFile(){
        navegador.findElement(By.id("picture")).sendKeys("https://www.tei.org/sites/default/files/styles/1920w_x_860h/public/NebraskaImage_small.jpg?itok=XCshL4YX");
        return this;
    }
    public ProductDataPage clickNextProductData(){
        navegador.findElement(By.id("nextenterproductdata")).click();
        return new ProductDataPage(navegador);
    }
/*
        // marcar label id=skydiving

        // preencher campo id=website

        // clicar button id=nextenterproductdata


    @Then("FormEnterProductData open")
    public void form_enter_product_data_open() {
        // validar redirecionar para formulario EnterProdustDataPage
        throw new io.cucumber.java.PendingException();
    }*/
}
