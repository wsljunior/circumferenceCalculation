package entities;

public class Calculator {
	public static final double PI = 3.14;

	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * Math.pow(radius, 3) / 2.0;
	}
}
