package com.Cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

	int ar[] = { 12, 6 };
	double result;

	@Test(priority=0)
	public void add() {
		result = Calcullatot.cal();

		Assert.assertEquals(result, 18.0, "Test Failed");
	}

	@Test(priority=1)
	public void sub() {
		result = Calcullatot.cal();
		Assert.assertEquals(result, 6.0, "Test Failed");
	}

	@Test(priority=2)
	public void mul() {
		result = Calcullatot.cal();
		Assert.assertEquals(result, 72.0, "Test Failed");
	}

	@Test(priority=3)
	public void div() {
		result = Calcullatot.cal();
		Assert.assertEquals(result, 2.0, "Test Failed");
	}
}
