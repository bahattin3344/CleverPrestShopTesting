package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class Main {
    Elements el=new Elements();
    @Given("Navigate to Clever")
    public void navigate_to_clever() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @And("Click on the element in Elements")
    public void clickOnTheElementInElements(DataTable dt) {
        List<String> dtClick=dt.asList(String.class);
        for (int i = 0; i < dtClick.size(); i++) {
            WebElement linkWebElement = el.getWebElement(dtClick.get(i));
            el.myClick(linkWebElement);
        }

    }

    @And("User sending the keys in Elements")
    public void userSendingTheKeysInElements(DataTable dt) {
        List< List<String> >   items=  dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e=el.getWebElement(items.get(i).get(0));
            String write = items.get(i).get(1);

            el.mySendKeys(e, write);
        }

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        el.verifyContainsText(el.registerSuccess,"MY ACCOUNT");
    }

    @And("User sending the keys")
    public void userSendingTheKeys() {
        el.mySendKeys(el.firstName,"denizaydın");
        el.mySendKeys(el.lastName,"aydın");
        el.mySendKeys(el.createPassword,"deniz3344");
    }

    @And("User select state")
    public void userSelectState() {
        Select stateSelection=new Select(el.id_state);
        stateSelection.selectByIndex(1);
    }

    @And("User Select country")
    public void userSelectCountry() {
        Select countrySelection=new Select(el.id_country);
        countrySelection.selectByIndex(0);
    }



    @And("User select subject,order,product and enter msg")
    public void userSelectSubjectOrderProductAndEnterMsg() {
        Select subjectSelection=new Select(el.subject);
        subjectSelection.selectByIndex(1);
        Select orderSelection=new Select(el.order);
        orderSelection.selectByIndex(1);
        el.mySendKeys(el.msg,"hatalı ürün");

    }

    @And("Hover on the element in Woman")
    public void hoverOnTheElementInWoman() {
        new Actions(GWD.getDriver()).moveToElement(el.getWebElement("woman")).build().perform();
    }

    @And("Click on the iframe add")
    public void clickOnTheIframeAdd() {
        el.myClick(el.selectTsirt);
        GWD.getDriver().switchTo().frame(0);
        el.myClick(el.addTsirt);
        GWD.getDriver().switchTo().defaultContent();
    }
}
