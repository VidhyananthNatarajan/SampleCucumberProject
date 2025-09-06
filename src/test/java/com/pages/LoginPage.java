package com.pages;

import org.openqa.selenium.By;

import commonMethods.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass {
	//@Given ("Enter the username as (.*)")
	public LoginPage enterusername(String username) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		return this;
		
	}
	@Given ("Enter the Password as (.*)")
	public LoginPage enterpassword(String password) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		return this;
		
	}
	@When ("Click on Login")
	public DashboardPage clickbtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	return new DashboardPage();
	}
}
