package org.example.StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SS1to4xsl_StepDef {
    @DataProvider(name = "GuruTest")
    public Object[][] testData() throws Exception {
        return Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME,
                Util.TABLE_NAME);
    }
    @When("user enter valid userId")
    public void entervaliduserid(String username){
        Hooks.driver.findElement(By.name("uid")).clear();
        Hooks.driver.findElement(By.name("uid")).sendKeys(username);
    }
    @And("user enter valid password")
    public void entervalidpassword(String password){
        Hooks.driver.findElement(By.name("password")).clear();
        Hooks.driver.findElement(By.name("password")).sendKeys(password);
    }
}
