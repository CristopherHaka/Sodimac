package com.sodimac.automation.stageset;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {
				   "@ExistenTablas"
				 + ",@VerificoPK"
			     + ",@VerificoFK"
		},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/TablasBUCReporte.html"}
)
public class tablasBUCStageSet extends StageSet{

}
