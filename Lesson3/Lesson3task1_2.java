package by.epam.cdptr.main;

import java.util.Scanner;

class Lesson3task1_2 {

	public static void main(String[] args) {
	int number = 0;
	int poslZifraKv = 0;
	number = readFromConsole();	
	poslZifraKv = countposlZifraKv(number);
	printResult(number, poslZifraKv);
	}
	
	
	
	
	public static int countposlZifraKv(int number) {	  
	int poslZifra = 0;
	int poslZifraKv = 0;
		  poslZifra = number % 10; 
		  switch (poslZifra) { 
		  case 0:
         poslZifraKv = 0;
         break; 
         case 1:
        poslZifraKv = 1;
        break;
        case 2:
		poslZifraKv = 4;
		break;
		case 3:
         poslZifraKv = 9; 
         break;
         case 4: 
        poslZifraKv = 6;
        break;
        case 5:
        poslZifraKv = 5;
        break;
        case 6:
        poslZifraKv = 6;
        break;
        case 7:
        poslZifraKv = 9;
        break;
        case 8:
        poslZifraKv = 4;
        break;
        case 9:
        poslZifraKv = 1;
        break;
		}
        return poslZifraKv;
        		  
	}
		  
		public static void printResult(int number, int poslZifraKv) {  
        System.out.println("Квадрат последней цифры числа " + number + " равняется " + poslZifraKv);
		}
	
	
	
	public static int readFromConsole(){ 
		Scanner sc = new Scanner(System.in); 
		int number = 0;
     System.out.print("Введите number: ");
  while(!sc.hasNextDouble()){ 
  sc.next();  
  System.out.print("Введите number: ");
  } 
  number = sc.nextInt(); 
  return number; 
  } 

}
