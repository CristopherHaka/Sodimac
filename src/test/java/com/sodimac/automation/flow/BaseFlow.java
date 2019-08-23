package com.sodimac.automation.flow;

import java.io.Reader;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

@RunWith(Suite.class)
public class BaseFlow {
	public static WebDriver driver;
	public static SqlMapClient sqlMap;
	
	public static String navegador = "chrome";
	
	@BeforeClass
	public static void InitializeWebDriver() throws Exception {
//		setDriverDesa();
//	    pageModel = PageFactory.initElements(driver, NuevaPropuestaModel.class);
		String resource = "com/sodimac/automation/config/ConfiguracionIbatis.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		System.out.println("conexion correcta");
	}
	    
	@AfterClass
	public static void setUpFinal() throws Exception {
//		driver.quit();
	}

	public static void setDriverDesa() throws Exception {
		switch (navegador) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/WebDriver/Chrome/Windows/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
			default:
				break;
		}
		
	}
}
