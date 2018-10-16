package by.epam.cdptr.main;

import java.util.Scanner;

class Sum {

	public static void main(String[] args) {
		
		double a = 0, b = 0, c = 0, d = 0, s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение а :");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.println("Введите значение b :");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.println("Введите значение c :");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		System.out.println("Введите значение d :");
		if (sc.hasNextDouble()) {
			d = sc.nextDouble();
		}
		
		
		s = a + b + c + d;
				
		System.out.println("Сумма чисел =  " + s);
		
	}

}
