package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_MainPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SS1to4_StepDef {
    P01_MainPage p01 = new P01_MainPage();
    @Given("user goto \\\"(.*)\\\"$")
    public void mainpagelink(String link){
        Hooks.driver.get(link);
    }
    @When("user enter invalid username \\\"(.*)\\\"$")
    public void enterinvaliduserid(String invuserid){
        p01.UserIdBox().sendKeys(invuserid);
    }
    // OR
    @When("user enter valid username \\\"(.*)\\\"$")
    public void enteruserid(String userid){
        p01.UserIdBox().sendKeys(userid);
    }
    @And("user enter invalid password \\\"(.*)\\\"$")
    public void enterinvpassword(String invpassword){
        p01.PasswordBox().sendKeys(invpassword);
    }
    //OR
    @And("user enter valid password \\\"(.*)\\\"$")
    public void enterpassword(String password){
        p01.PasswordBox().sendKeys(password);
    }
    @Then("user click login")
    public void clickloginbtn(){
        p01.loginbtn().click();
    }
    @Then("login is successful")
    public void assertthelogin(){
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed());
    }
    // OR
    @Then("A pop up \"user or password is not valid\"")
    public void assertfailureoflogin(){
        Alert a = Hooks.driver.switchTo().alert();
        String s= Hooks.driver.switchTo().alert().getText();
        Assert.assertEquals(s, "User or Password is not valid");
        a.accept();
    }
}
