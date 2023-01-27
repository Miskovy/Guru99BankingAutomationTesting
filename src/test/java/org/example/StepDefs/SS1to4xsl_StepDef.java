package org.example.StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class SS1to4xsl_StepDef {
    Util utilities = new Util();
    String[][] userdata;

    {
        try {
            userdata = utilities.testData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @When("user enter valid userId")
    public void entervaliduserid() throws IOException {
        Hooks.driver.findElement(By.name("uid")).clear();
        Hooks.driver.findElement(By.name("uid")).sendKeys(userdata[0][0]);
    }
    @And("user enter valid password")
    public void entervalidpassword(){
        Hooks.driver.findElement(By.name("password")).clear();
        Hooks.driver.findElement(By.name("password")).sendKeys(userdata[0][1]);
    }
    @When("user enter invalid username")
    public void enterinvalidusername(){
        Hooks.driver.findElement(By.name("uid")).clear();
        Hooks.driver.findElement(By.name("uid")).sendKeys(userdata[1][0]);
    }
    @And("user enter invalid password")
    public void enterinvalidpassword(){
        Hooks.driver.findElement(By.name("password")).clear();
        Hooks.driver.findElement(By.name("password")).sendKeys(userdata[2][1]);
    }
}
