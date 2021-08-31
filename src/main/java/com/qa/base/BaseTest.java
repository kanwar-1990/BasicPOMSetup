package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest extends BasePage {

	public BasePage BasePage;
	public Properties Prop;
	public WebDriver driver;

	// @BeforeMethod--Use it when using for framework
	@Test
	public void Setup() {
		BasePage = new BasePage();
		Prop = BasePage.init_prop();
		String browser = Prop.getProperty("browser");
		driver = BasePage.inti_driver(browser);
		driver.get(Prop.getProperty("url"));
		

	}
}
