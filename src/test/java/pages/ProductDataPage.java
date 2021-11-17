package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage extends BasePage {
    public ProductDataPage(WebDriver navegador) {
        super(navegador);
    }

    public ProductDataPage enterStartDate() {
        navegador.findElement(By.id("startdate")).sendKeys("01/01/2000");
        return this;
    }
    public ProductDataPage selectInsuranceSum(){
        WebElement insuranceSum = navegador.findElement(By.id("insurancesum"));
        new Select(insuranceSum).selectByValue("7000000");
        return this;
    }
    public ProductDataPage selectDamageInsurance(){
        WebElement damageInsurance = navegador.findElement(By.id("damageinsurance"));
        new Select(damageInsurance).selectByValue("Full Coverage");
        return this;
    }
    public ProductDataPage markOptionalProducts(){
        navegador.findElement(By.id("EuroProtection")).click();
        navegador.findElement(By.id("LegalDefenseInsurance")).click();
        return this;
    }
    public SelectPriceOptionPage clickNextSelectPriceOption(){
        navegador.findElement(By.id("nextselectpriceoption")).click();
        return new SelectPriceOptionPage(navegador);
    }
}