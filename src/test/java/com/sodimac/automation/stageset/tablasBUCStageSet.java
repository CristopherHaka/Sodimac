package com.sodimac.automation.stageset;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@ExistenTablas"
				+",@VerificoPK"
				+",@VerificoFK"
				   +",@VerificoCamposObligatoriosCustomer"
				   + ",@VerificoCamposObligatoriosAddress"
				   + ",@VerificoCamposObligatoriosContact"
				   +",@VerificoCamposObligatoriosContact_Method"
				   +",@VerificoCamposObligatoriosLov"
				   +",@VerificoCamposObligatoriosEconomy_Activity"
				   +",@VerificoCamposObligatoriosEconomy_Type"
				   +",@VerificoCamposObligatoriosTransaction_Log"
				
		},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/TablasBUCReporte.html"}
)
public class tablasBUCStageSet extends StageSet{

}
