package by.segg3r.jtractor.test;

import com.jprotractor.NgWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class ChromeConfiguration {

	@Bean
	public WebDriver seleniumWebDriver() {
		System.setProperty("webdriver.chrome.driver", "F:\\job\\repositories\\studio\\trunk\\webapps\\DashboardFrontend\\node_modules\\protractor\\selenium\\chromedriver_2.25.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS)
				.implicitlyWait(10, TimeUnit.SECONDS)
				.setScriptTimeout(10, TimeUnit.SECONDS);

		return driver;
	}

	@Bean
	public NgWebDriver ngWebDriver() {
		return new NgWebDriver(seleniumWebDriver());
	}

}
