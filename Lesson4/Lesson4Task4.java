package by.epam.cdptr.main;

import java.util.Random;
import java.util.Scanner;

public class Lesson4Task4 {

			public static void main(String[] args) {
			
				int N;
				N = enterNValue();
				int[] A = new int[N];
				enterRandomArray(A, N);
				for (int i = 0; i < A.length; i++) {
					System.out.print("A[" + i + "]=" + A[i] + "; ");
					System.out.println();
				}
				findZeroElements(A);
			}
				
			public static int enterNValue() {
				int N = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Введите N :");
				if (sc.hasNextInt()) {
					N = sc.nextInt();
				}
				return N;		
			}


		    public static void enterRandomArray(int[] A, int N) {
		    	Random rand = new Random();
		    	for (int i = 0; i < A.length; i++) {
		    		A[i] = rand.nextInt(N);
		    	}
		    }
		    
		    public static void findZeroElements(int[] A) {
		    	 
		    	int j = 0;
		    	int index = 0;
		    	for (int i = 0; i < A.length; i++) {
		    		
		    		if (A[i] == 0) {
		    		index = i;
		    		System.out.println("Новый массив B[" + j + "] = " + index);
		    		j++;
		    		
		    	}
		    	}
		    		if (j == 0) {
		    			System.out.println("Нулевых элементов в массиве нет");
		    		
		    	}
		    } 	   
		}   