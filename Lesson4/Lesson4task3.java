package by.epam.cdptr.main;

import java.util.Scanner;

class Lesson4task3 {

	public static void main(String[] args) {
		int n = 0;
		n = enterNValue();
		double[] a = new double[n];
		enterArray(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=" + a[i] + "; ");
			//System.out.println();
		}
		estimateSequence(a);
		
	}
	    public static int enterNValue() {
		   int n = 0;
	       Scanner sc = new Scanner(System.in);
		   System.out.print("Введите n = ");
		   if (sc.hasNextInt()) {
			   n = sc.nextInt();
		   }
		   return n;
	    }
		
	     public static void enterArray(double[] a) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < a.length; i++) {
				System.out.print("a [" + i + "] = " );
				a[i] = sc.nextDouble();
			}
			
		}
	     
	     public static void estimateSequence(double[] a) {
	    	int index = 0;
	    	 for (int i = 1; i < a.length; i++) {
	    		 
	    		 if (a[i - 1] < a[i]) {
	    			index = i;
	    				    			
	    		 } else {
	    			 System.out.println("Последовательность массива не возрастающая!");
	    			 return;
	    		 }
	      	 }
	    	 if (index > 0) {
	    		 System.out.println("Последовательность массива возрастающая!");
	    	 }
	     }
	     }
	   
	  
	   	 
	
