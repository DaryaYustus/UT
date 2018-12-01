package com.epam.training.triangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CheckTrianglePositiveTest extends OverallDataProvider{
	
	@Test(dataProvider = "triangleOrdynary")
	public void tstCheckTriangleTrue(ArrayList<Double> values) {
		double a = values.get(0);
		double b = values.get(1);
		double c = values.get(2);
		Triangle triangle = new Triangle(a, b, c);
		assertTrue(triangle.checkTriangle());
		assertEquals(triangle.getMessage(), "");
	}

}
