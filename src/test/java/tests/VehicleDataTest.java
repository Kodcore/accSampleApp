package tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import pages.VehicleDataPage;
import support.Web;

@DisplayName("Functional test web ")
public class VehicleDataTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }
    //@After
    public void tearDown(){
        navegador.quit();
    }

   //@Test
    public void testValidaTituloAbaVehicleData(){
        String tituloAbaVehicleData = new VehicleDataPage(navegador)
                .capturarTituloAbaVehicleData();
        assertEquals("Enter Vehicle Data",tituloAbaVehicleData);
    }
   @Test
    public void testVehicleInsuranceApplication(){
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
                .clickNextInsurantData()
                .enterName()
                .enterDateOfBirth()
                .selectGender()
                .enterStreetAddress()
                .selectCountry()
                .enterZipCode()
                .enterCity()
                .selectOccupation()
                .checkHobbies()
                .enterWebsite()
                .enterPictureFile()
                .clickNextProductData()
        ;

    }
    //@Test
    public void testValidaTituloAbaInsurantData(){
        String tituloAbaInsurantData = new VehicleDataPage(navegador)
                .enterVehicleData()
                .capturaTituloAbaInsurantData();
        assertEquals("Enter Insurant Data",tituloAbaInsurantData);
    }

}
