package com.epam.training.triangle;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

;

public class CheckTriangleNegativeTest {
	@Test
	public void tstCheckTriangleSideALessOrEqualsZeroFalse() {
		double sideA = -2.0;
		double sideB = 3.0;
		double sideC = 4.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "a<=0");
	}

	@Test
	public void tstCheckTriangleSideBLessOrEqualsZeroFalse() {
		double sideA = 2.0;
		double sideB = -3.0;
		double sideC = 4.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "b<=0");

	}

	@Test
	public void tstCheckTriangleSideCLessOrEqualsZeroFalse() {
		double sideA = 2.0;
		double sideB = 3.0;
		double sideC = -4.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "c<=0");

	}

	@Test
	public void tstCheckTriangleSumABLessOrEqualsCFalse() {
		double sideA = 2.0;
		double sideB = 3.0;
		double sideC = 6.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "a+b<=c");

	}

	@Test
	public void tstCheckTriangleSumCBLessOrEqualsAFalse() {
		double sideA = 6.0;
		double sideB = 2.0;
		double sideC = 3.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "b+c<=a");

	}

	@Test
	public void tstCheckTriangleSumCALessOrEqualsBFalse() {
		double sideA = 2.0;
		double sideB = 6.0;
		double sideC = 3.0;
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		assertFalse(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "a+c<=b");

	}

}
