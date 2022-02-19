package KBBRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/failed.txt"
        ,glue="com/rcsa/steps"
        ,monochrome = true
        ,plugin= "pretty"
)
public class FailedRunner {
}