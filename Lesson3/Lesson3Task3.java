package by.epam.cdptr.main;

import java.util.Scanner;

class Lesson3Task3 {

	public static void main(String[] args) {
		double x, Fx;
		x = readFromConsole();
		Fx = countFunction(x);
		
		if ((x <= -3)||(x > 3)) {
			System.out.println("Fx равно :" + Fx);
		} else {
			System.out.println("Значение функции Fx не существует");
		}
		
	}
	
		public static double readFromConsole() {
			double x = 0;
			Scanner sc = new Scanner(System.in);
				System.out.print("Введите x :");
					if (sc.hasNextDouble()) {
					x = sc.nextDouble();
					}
					return x;	
		}
		
		
		public static double countFunction(double x) {
			double Fx = 0;
			if (x <= -3) {
				Fx = 3;
			} else {
				if (x > 3) 
					Fx = 1 / (x * x + 1);
			} 
				
				return Fx;
		}

	}
