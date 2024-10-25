package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.TestCasePage_Pom;

public class TestCase_Step7 extends Baseclass {
	Login_Pom login;
	TestCasePage_Pom testPom;
	

@When("User Click on Test Cases button")
public void userClickOnTestCasesButton() {
	login = new Login_Pom(driver);
	testPom = new TestCasePage_Pom(driver);
	jsclick(login.getTestcaseBtn());
}
@Then("User Verify user is navigated to test cases page successfully")
public void userVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
	String text = testPom.getTescaseText().getText();
    System.out.println(text);
    Assert.assertEquals(text," TEST CASES");
}

}
