package by.epam.cdptr.main;

import java.util.Scanner;

class Round {

	public static void main(String[] args) {
		double R = 0, S, L;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите  R: ");
		if (sc.hasNextDouble()) {
			R = sc.nextDouble();
		}
		S = Math.PI * R * R;
		L = 2 * Math.PI * R;
		System.out.println("Площадь круга равна :" + S);
		System.out.println("Длина окружности равна :" + L);

	}

}
