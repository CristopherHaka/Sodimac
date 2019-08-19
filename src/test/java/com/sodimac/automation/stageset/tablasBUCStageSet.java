package com.sodimac.automation.stageset;
import java.io.File;
import java.io.IOException;
import org.junit.AfterClass;
import cucumber.api.CucumberOptions;

@CucumberOptions(tags = {"@tablasBUC"}//tag de ejecucion de nuestro feature
, plugin = { "pretty:target/reportes/pretty/pretty.txt",
		"html:target/reportes/html", "json:target/reportes/json/report.json", "junit:target/reportes/junit/junit.xml",
		"usage:target/reportes/usage/usage.json", "rerun:target/reportes/rerun/rerun.txt",
		"com.cucumber.listener.ExtentCucumberFormatter:Reporte/ReporteDemo.html" })//generacion de reporte , ruta donde sera almacenado
//152.139.28.77/ResultadosSeleniumTest/

public class tablasBUCStageSet {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		//Reporter.loadXMLConfig(new File(ConfigFileReader.getInstance().getReportConfigPath()));//creacion de reporte personalizado

	}
}
