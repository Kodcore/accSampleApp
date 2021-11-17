package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class VehicleDataPage extends BasePage {
    public VehicleDataPage(WebDriver navegador) {
        super(navegador);
    }

    //validar formulario apresentado
    @Given("aba EnterVehicleData")
    public String capturarTituloAbaVehicleData()
    {return navegador.findElement(By.id("entervehicledata")).getAttribute("name");
    }

    @When("preencho o formulario")
    public VehicleDataPage selectMake() {
        WebElement make = navegador.findElement(By.id("make"));
        new Select(make).selectByValue("Audi");
         return this;
    }

    public VehicleDataPage enterEnginePerformance(){
        navegador.findElement(By.id("engineperformance")).sendKeys("107");
        return this;
    }

    public VehicleDataPage enterDateOfManufacture(){
        navegador.findElement(By.id("dateofmanufacture")).sendKeys("01/03/2020");
        return this;
    }

    public VehicleDataPage selectNumberOfSeats(){
        WebElement seats = navegador.findElement(By.id("numberofseats"));
        new  Select(seats).selectByValue("4");
        return this;
    }
    public VehicleDataPage markRightHandDrive(){
        WebElement check = navegador.findElement(By.xpath("//span[contains(@class,\"ideal-radio\")]"));
        check.click();
        return this;
    }

    public VehicleDataPage selectFuelType(){
        WebElement fuelType = navegador.findElement(By.id("fuel"));
        new Select(fuelType).selectByValue("Diesel");
        return this;
    }

    public VehicleDataPage informPayload(){
        navegador.findElement(By.id("payload")).sendKeys("405");
        return this;
    }

    public VehicleDataPage informTotalWeight(){
        navegador.findElement(By.id("totalweight")).sendKeys("1740");
        return this;
    }
    public VehicleDataPage informListPrice(){
        navegador.findElement(By.id("listprice")).sendKeys("100000");
        return this;
    }
    public VehicleDataPage informLicensePlateNumber(){
            navegador.findElement(By.id("licenseplatenumber")).sendKeys("IO789");
        return this;
    }
    public VehicleDataPage informAnnualMileage(){
            navegador.findElement(By.id("annualmileage")).sendKeys("200");
        return this;
    }
    @Then("formEnterInsurantData sera apresentado")
    public InsurantDataPage clickNextInsurantData(){
        navegador.findElement(By.id("nextenterinsurantdata")).click();
        return new InsurantDataPage(navegador);
    }
    public InsurantDataPage enterVehicleData(){
        new VehicleDataPage(navegador)
                .selectMake()
                .enterEnginePerformance()
                .enterDateOfManufacture()
                .selectNumberOfSeats()
                .markRightHandDrive()
                .selectFuelType()
                .informPayload()
                .informTotalWeight()
                .informListPrice()
                .informLicensePlateNumber()
                .informAnnualMileage()
                .clickNextInsurantData();
        return new InsurantDataPage(navegador);
    }


}
