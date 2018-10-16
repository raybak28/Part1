package by.epam.cdptr.main;

import java.util.Scanner;

public class Lesson3Task2_2 {

	public static void main(String[] args) {
		double a = 0, b = 0, h = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите а :");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.print("Введите b :");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.print("Введите шаг h :");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
		
		countFunction(a, b, h);
		
	}
	
	public static double countFunction(double a, double b, double h) {
		double x;
		double Fx = 0;
		for (x = a; x <= b; x = x + h) {
			Fx = Math.tan(x / 2) * 2 + 1;
			System.out.println("| " + x + " |" + "| " + Fx + " |");
		}
		return Fx;

	}
}
