package com.epam.training.triangle;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class OverallDataProvider {

	@DataProvider(name = "triangleRectangular")
	// прямоугольный
	public Object[][] createSomeData() {
		return new Object[][] {
				{ new ArrayList<Double>(Arrays.asList(3.0, 4.0, 5.0)) },
				{ new ArrayList<Double>(Arrays.asList(6.0, 8.0, 10.0)) },
				{ new ArrayList<Double>(Arrays.asList(10.0, 15.0,
						18.027756377319946)) } };
	}

	@DataProvider(name = "triangleEquilateral")
	// равносторонний
	public Object[][] createSomeDataForTriangleEquilateral() {
		return new Object[][] {
				{ new ArrayList<Double>(Arrays.asList(5.0, 5.0, 5.0)) },
				{ new ArrayList<Double>(Arrays.asList(18.0, 18.0, 18.0)) },
				{ new ArrayList<Double>(Arrays.asList(1.23, 1.23, 1.23)) } };
	}

	@DataProvider(name = "triangleIsosceles")
	// равнобедренный
	public Object[][] createSomeDataForTriangleIsosceles() {
		return new Object[][] {
				{ new ArrayList<Double>(Arrays.asList(5.0, 5.0, 6.0)) },
				{ new ArrayList<Double>(Arrays.asList(18.0, 18.0, 12.0)) },
				{ new ArrayList<Double>(Arrays.asList(1.23, 1.23, 1.0)) } };
	}

	@DataProvider(name = "triangleOrdynary")
	// обычный
	public Object[][] createSomeDataForTriangleOrdynary() {
		return new Object[][] {
				{ new ArrayList<Double>(Arrays.asList(4.0, 5.6, 6.1)) },
				{ new ArrayList<Double>(Arrays.asList(18.0, 12.0, 16.0)) },
				{ new ArrayList<Double>(Arrays.asList(6.1, 5.23, 2.0)) } };
	}

}
