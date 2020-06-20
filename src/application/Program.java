package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter radius: ");
			double radius = sc.nextDouble();
			double c = Calculator.circunference(radius);
			double v = Calculator.volume(radius);
			System.out.printf("Circunference: %.2f", c);
			System.out.printf("\nVolume: %.2f", v);
		}

		System.out.println("\nPI value: " + Calculator.PI);

	}

}
