package by.epam.cdptr.main;

import java.util.Scanner;

public class Trianle1 {

	public static void main(String[] args) {
		double a = 0, b = 0;
		double g, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение а :");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.println("Введите значение b :");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		g = Math.sqrt(a*a + b*b);
		s = a * b / 2;
		
		System.out.println("Гипотенуза = " + g + "  Площадь треугольника = " + s);
		
		
	}

}
