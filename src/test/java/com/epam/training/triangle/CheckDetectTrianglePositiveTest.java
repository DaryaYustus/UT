package com.epam.training.triangle;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CheckDetectTrianglePositiveTest extends OverallDataProvider{
	
	
	final int TR_EQUILATERAL = 1; // равносторонний
	final int TR_ISOSCELES = 2; // равнобедренный
	final int TR_ORDYNARY = 4; // обычный
	final int TR_RECTANGULAR = 8; // прямоугольный
	
	@Test(dataProvider = "triangleRectangular")//прямоугольный
	public void tstDetectTriangleRectangular(ArrayList<Double> values) {
		double a = values.get(0);
		double b = values.get(1);
		double c = values.get(2);
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(triangle.detectTriangle(), TR_RECTANGULAR);
	}

	@Test(dataProvider = "triangleEquilateral")//равносторонний
	public void tstDetectTriangleEquilateral(ArrayList<Double> values) {
		double a = values.get(0);
		double b = values.get(1);
		double c = values.get(2);
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(triangle.detectTriangle(), TR_EQUILATERAL);

	}

	@Test(dataProvider = "triangleIsosceles")//равнобедренный
	public void tstDetectTriangleIsosceles(ArrayList<Double> values) {
		double a = values.get(0);
		double b = values.get(1);
		double c = values.get(2);
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(triangle.detectTriangle(), TR_ISOSCELES);

	}

	@Test(dataProvider = "triangleOrdynary")//обычный
	public void tstDetectTriangleOrdynary(ArrayList<Double> values) {
		double a = values.get(0);
		double b = values.get(1);
		double c = values.get(2);
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(triangle.detectTriangle(), TR_ORDYNARY);

	}

}
