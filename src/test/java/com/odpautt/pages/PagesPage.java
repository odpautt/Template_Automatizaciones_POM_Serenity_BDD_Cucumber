package com.odpautt.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://urlsDefault.com")
public class PagesPage extends PageObject {
    public PagesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="")
    private WebElementFacade nameWebelement;
}
