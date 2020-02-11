package test;
import java.util.Scanner;
public class SumvaluesofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements:");
		n= scanner.nextInt();
		
	      int[] array = new int[n];
	      int sum = 0;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<n; i++)
	      {
	    	  array[i] = scanner.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }

	}


