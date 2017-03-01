package by.segg3r.jtractor;

import com.jprotractor.NgBy;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class by extends By {

	private by() {}

	public static By css(String css) {
		return By.cssSelector(css);
	}

	public static By binding(final String binding) {
		return NgBy.binding(binding);
	}

	public static By binding(final String binding, String rootSelector) {
		return NgBy.binding(binding, rootSelector);
	}

	public static By buttonText(final String text) {
		return NgBy.buttonText(text);
	}

	public static By cssContainingText(final String cssSelector, String text) {
		return NgBy.cssContainingText(cssSelector, text);
	}

	public static By input(final String input) {
		return NgBy.input(input);
	}

	public static By model(final String model) {
		return NgBy.model(model);
	}

	public static By model(final String model, String rootSelector) {
		return NgBy.model(model, rootSelector);
	}

	public static By partialButtonText(final String text) {
		return NgBy.partialButtonText(text);
	}

	public static By repeater(final String repeat) {
		return NgBy.repeater(repeat);
	}

	public static By repeaterColumn(final String repeat, String binding) {
		return NgBy.repeaterColumn(repeat, binding);
	}

	public static By repeaterElement(final String repeat, Integer index, String binding){
		return NgBy.repeaterElement(repeat, index, binding);
	}

	public static By repeaterRows(final String repeat, Integer index){
		return NgBy.repeaterRows(repeat, index);
	}

	public static By options(final String options) {
		return NgBy.options(options);
	}

	public static By selectedOption(final String model) {
		return NgBy.selectedOption(model);
	}

	public static By selectedRepeaterOption(final String repeat) {
		return NgBy.selectedRepeaterOption(repeat);
	}

	@Override
	public List<WebElement> findElements(SearchContext context) {
		throw new RuntimeException("Not implemented");
	}

}
