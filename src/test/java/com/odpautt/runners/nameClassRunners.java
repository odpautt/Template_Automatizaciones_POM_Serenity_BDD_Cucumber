package com.odpautt.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "path/feature"
        ,glue = "package.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
        ,tags = "@Test"
)
public class nameClassRunners {
}
