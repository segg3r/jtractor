package by.segg3r.jtractor.test;

import by.segg3r.jtractor.Element;
import by.segg3r.jtractor.by;
import com.jprotractor.NgWebDriver;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class JTractorTest {

	@Autowired
	protected NgWebDriver driver;

	protected Element element(By selector) {
		return new Element(driver, driver.findElement(selector));
	}

	protected AllWrapper element = new AllWrapper();

	public final class AllWrapper {

		public List<Element> all(By selector) {
			return driver.findElements(selector).stream()
					.map(element -> new Element(driver, element))
					.collect(toList());
		}

	}

}
