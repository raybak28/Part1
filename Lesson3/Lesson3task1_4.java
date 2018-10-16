package by.epam.cdptr.main;

import java.util.Scanner;

class Lesson3task1_4 {

	public static void main(String[] args) {
		int number;
		number = readFromConsole();
		defineDigit(number);
	}
		
		
		public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		  System.out.print("Введите число: ");
		  if (sc.hasNextInt()) 
			  number = sc.nextInt();
		  return number;
		}
		  
		  public static void defineDigit(int number) {
		  while (number != 0) {
			 int digit = 0;		  
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
		   System.out.println("В числе есть четная цифра.");
		   return;
		   }
	  }  
		  System.out.println("В числе нет четных цифр."); 

	}
		  

}