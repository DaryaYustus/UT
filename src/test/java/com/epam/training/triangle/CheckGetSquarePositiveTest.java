package com.epam.training.triangle;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.Test;

public class CheckGetSquarePositiveTest {

	@Test
	public void tstGetSquareTriangle() {
		Random random = new Random();

		double maxValue = Double.MAX_VALUE;
		double a = maxValue * random.nextDouble();
		double b = maxValue * random.nextDouble();
		double c = maxValue * random.nextDouble();

		Triangle triangle = new Triangle(a, b, c);
		double p = (a + b + c) / 2;
		double expected = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		assertEquals(triangle.getSquare(), expected, 0.01);
	}

}
