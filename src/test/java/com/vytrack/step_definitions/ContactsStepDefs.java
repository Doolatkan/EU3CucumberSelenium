package com.vytrack.step_definitions;
import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        new DashboardPage().waitUntilLoaderScreenDisappear();

        //get the list of WebElement and convert them to the list of String and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("expectedOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);

    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {

        System.out.println("userInfo = " + userInfo);
        //use map information to login and also verify firstname and lastname

        //login with map info
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

         new DashboardPage().waitUntilLoaderScreenDisappear();
        //verify firstname and lastname
        Assert.assertEquals(userInfo.get("firstname")+" " + userInfo.get("lastname"), new DashboardPage().getUserName());
        System.out.println("Expected name = " + (userInfo.get("firstname")+" " + userInfo.get("lastname")));
        System.out.println("Actual name = " + new DashboardPage().getUserName());
    }
}
