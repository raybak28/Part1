package by.epam.cdptr.main;

import java.util.Scanner;

class FormLes2 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, z, res;
		Scanner sr = new Scanner(System.in);
		System.out.print("Введите a : ");
		if (sr.hasNextDouble()) {
		   a = sr.nextDouble();		   
		}
		System.out.print("Введите b : ");
		if (sr.hasNextDouble()) {
		   b = sr.nextDouble();
		}
		System.out.print("Введите c : ");
		if (sr.hasNextDouble()) {
		   c = sr.nextDouble();
		}
		z  = b * b + 4 * a * c;
		if ((a != 0)&&(z >= 0)) {
			res = ((b + Math.sqrt(z)) / 2 * a) - a * a * a * c + b;
			System.out.println("Значение функции = " + res);
		} else {
			System.out.println("Введите другие значения");
		}
		

	}

}
