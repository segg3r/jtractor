package by.segg3r.jtractor;

import by.segg3r.jtractor.test.ChromeConfiguration;
import by.segg3r.jtractor.test.JTractorTest;
import by.segg3r.testng.util.spring.ContextConfiguration;
import by.segg3r.testng.util.spring.SpringContextListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.*;

@Listeners({SpringContextListener.class})
@ContextConfiguration(configClasses = ChromeConfiguration.class)
public class CalculatorTest extends JTractorTest {

	@Test(description = "calculator")
	public void testCalculator() {
		driver.navigate().to("http://juliemr.github.io/protractor-demo/");

		Element first = element(by.model("first"));
		Element second = element(by.model("second"));
		Element button = element(by.buttonText("Go!"));
		Element result = element(by.binding("latest"));

		first.sendKeys("40");
		second.sendKeys("2");
		button.click();

		expect(result.getText()).toEqual("42");
	}

}
