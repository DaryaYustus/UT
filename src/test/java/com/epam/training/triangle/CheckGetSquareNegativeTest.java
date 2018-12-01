package com.epam.training.triangle;

import org.testng.annotations.Test;

public class CheckGetSquareNegativeTest {

	@Test(expectedExceptions = Exception.class)
	public void tstGetSquareWhenSideIsNegative() {
		Triangle triangle = new Triangle(-1, 6, 7);
		double expected = triangle.getSquare();
	}

	@Test(expectedExceptions = Exception.class)
	public void tstGetSquareCheckMaxDoubleValue() {
		Triangle triangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE,
				Double.MAX_VALUE);
		double expected = triangle.getSquare();
	}

}
