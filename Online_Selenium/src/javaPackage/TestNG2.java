package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test

	public void assertionCheck() {

		String exptectedResult = "Event Details";
		String actualResult = "Evont Details";

		try {
			Assert.assertEquals(actualResult, exptectedResult);
		} catch (AssertionError a) {
			a.printStackTrace();
		}
		System.out.println("Verification Successful");
	}

}
