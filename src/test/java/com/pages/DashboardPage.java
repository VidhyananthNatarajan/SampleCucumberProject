package com.pages;

import commonMethods.BaseClass;
import cucumber.api.java.en.Then;

public class DashboardPage extends BaseClass {
	
	@Then("Dashboard Page displays")
	public void getdashboardpage() {
		System.out.println(driver.getTitle());
		
	}

}
