/* import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.Feature;
import gherkin.ast.Scenario;
import org.junit.runner.RunWith;
import sun.jvm.hotspot.debugger.Page;

import static org.testng.Assert.*;

public class FullEnrollmentStepsTest {

    // here and after I'm practicing Cucumber JVM

    Feature: Patient enrolling for OneTouchHealth
    As a Patient,
    I want to go through the  Full enrollment form
    so that I could use My Journal

    Scenario: Valid Delegate
    Given the delegate is on Login Page
    When he enters "Bryan" as First name
    and enters "Griffin" as Last name
    and enters "11/11/2011" as DOB
    and enters "Msle" as Gender
    and enters "22222222222222222222" as InsuranceN
    and enters "nomail@nogmail.com" as Email
    and enters "nomail@nogmail.com" as Username
    and enters "nomail@nogmail.com" as Password
    and enters "nomail@nogmail.com" as ConfirmPassword
    and clicks iAcceptters checkbox
    and Submit the request for Enrolling
    Then ensure the form is complete with "Welcome, get started by watching the support videos below!" message

    Scenario: Invalid Delegate

    Given the delegate is on Login Page
    When he enters "Bryan" as First name
    and enters "Griffin" as Last name
    and enters "11/11/2011" as DOB
    and enters "Msle" as Gender
    and enters "22222222222222222222" as InsuranceN
    and enters "nomail@nogmail.com" as Email
    and enters "nomail@nogmail.com" as Username
    and enters "nomail@nogmail.com" as Password
    and enters "nomail@nogmail.com" as ConfirmPassword
    and clicks iAcceptters checkbox
    and Submit the request for Enrolling
    Then ensure the form is complete with "Welcome, get started by watching the support videos below!" message

}

*/