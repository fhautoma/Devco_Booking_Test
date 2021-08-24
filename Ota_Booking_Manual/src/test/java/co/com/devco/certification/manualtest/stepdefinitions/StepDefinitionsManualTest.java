package co.com.devco.certification.manualtest.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;

import static co.com.devco.certification.manualtestlib.ManualTest.validate;

public class StepDefinitionsManualTest {
    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("^(.*)$")
    public void iWantToRevertAFusionOperation(String step){
        validate(step, scenario.getName());
    }
}