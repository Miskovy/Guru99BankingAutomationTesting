package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.example.pages.P01_MainPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

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
    @And("Manager ID is Shown in op")
    public void asserttheID() throws IOException {
        Assert.assertEquals(Hooks.driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText(),"Manger Id : mngr472694");
        // Code to take Screenshot
        File scrFile = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
        // Code to save screenshot at desired location
        FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
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
