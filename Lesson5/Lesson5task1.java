package by.epam.cdptr.main;

import java.util.Scanner;

class Lesson5task1 {

	public static void main(String[] args) {
		int k = 5;
		int m = 0;
		int n = 1;
		Fraction[] mas = new Fraction[k];
		
		for (int i = 0; i < mas.length; i++) {
		
		  Scanner sc = new Scanner(System.in);   
		  System.out.print("Введите числитель дроби  " + (i + 1) + " :"); 
		  if (sc.hasNextInt()) {
			  m = sc.nextInt();
		}  
		  System.out.print("Введите знаменатель дроби  " + (i + 1) + " :"); 
		  if (sc.hasNextInt()) {
			  n = sc.nextInt();
		}  
		  mas[i] = new Fraction(m,n);
		  
		}  
		
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
			
		}
	}
}
	