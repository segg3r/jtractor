package by.segg3r.jtractor;

import com.jprotractor.NgWebDriver;
import com.jprotractor.NgWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Element extends NgWebElement {

	private final NgWebDriver webDriver;
	private final WebElement webElement;

	public Element(NgWebDriver webDriver, WebElement webElement) {
		super(webDriver, webElement);
		this.webDriver = webDriver;
		this.webElement = webElement;
	}

	public Element element(By selector) {
		return new Element(webDriver, webElement.findElement(selector));
	}

	public List<Element> all(By selector) {
		return webDriver.findElements(selector).stream()
				.map(element -> new Element(webDriver, element))
				.collect(toList());
	}

}
