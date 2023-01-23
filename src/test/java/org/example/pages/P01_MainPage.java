package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_MainPage {
public WebElement UserIdBox(){
    return Hooks.driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
}
public WebElement PasswordBox(){
    return Hooks.driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
}
public WebElement loginbtn(){
    return Hooks.driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
}
}
