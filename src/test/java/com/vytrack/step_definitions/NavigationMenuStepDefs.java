package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet -> Vehicles")
    public void the_user_navigate_to_Fleet_Vehicles() {
        System.out.println("Sales manager navigate to pages using the top menu Fleet -> Vehicles ");
    }

    @Then("the user should be able to see title: Vehicles")
    public void the_user_should_be_able_to_see_title_Vehicles() {
        System.out.println("Slaes manager should see correct page Title:Vehicles ");
    }

    @When("the user navigates to Marketing -> Campaigns")
    public void the_user_navigate_to_Marketing_Campaigns() {
        System.out.println("Sales manager navigate to pages using the top menu Marketing -> Campaigns");
    }

    @Then("the user should be able to see title: Campaigns")
    public void the_user_should_be_able_to_see_title_Campaigns() {
        System.out.println("Slaes manager should see correct page Title:Campaigns");
    }

    @When("the user navigates to Activities -> Calendar Events")
    public void the_user_navigate_to_Activities_Calendar_Events() {
        System.out.println("Sales manager navigate to pages using the top menu Activities -> Calendar Events");
    }

    @Then("the user should be able to see title: Calendars")
    public void the_user_should_be_able_to_see_title_Calendars() {
        System.out.println("Slaes manager should see correct page Title:Calendars");
    }

    @When("the user navigate to {string} {string}")
    public void the_user_navigate_to(String tab, String modul) {

        new DashboardPage().navigateToModule(tab,modul);


    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNum,actualNumber);
    }


}
