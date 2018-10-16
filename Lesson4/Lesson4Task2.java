package by.epam.cdptr.main;

import java.util.Random;
import java.util.Scanner;

class Lesson4Task2 {

	public static void main(String[] args) {
		int N = 0;
		int K = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите N :");
		if (sc.hasNextInt()) {
			N = sc.nextInt();
		}
		System.out.println("Введите K :");
		if (sc.hasNextInt()) {
			K = sc.nextInt();
		}
		int[] A = new int[N];
		
		enterRandomArray(A, N);
		
		for (int i = 0; i < A.length; i++) {
			System.out.print("A[" + i + "]=" + A[i] + "; ");
			System.out.println();
		}
		
		countSum(A, K);
		
	}
		

    public static void enterRandomArray(int[] A, int N) {
    	Random rand = new Random();
    	for (int i = 0; i < A.length; i++) {
    		A[i] = rand.nextInt(N);
    	}
    }
    
    public static void countSum(int[] A, int K) {
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
    	if (A[i] % K == 0) {
    		sum = sum + A[i];
    	} 
    	}
    	System.out.println("Сумма элементов массива кратных " + K + " равна: " + sum);
    }
    
    
}   
    
    