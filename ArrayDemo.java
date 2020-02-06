package array;
import java.util.Scanner;
public class ArrayDemo {
	


public static void main(String[] args) {
	int n,large,small;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of elements in array:");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	large=a[0];
	for(int i=0;i<n;i++)
	{
		if (large<a[i]) {
			large=a[i];
		}
	}
	System.out.println("largest number is:"+large);
	small=a[0];
	for(int i=0;i<n;i++) {
		if (small>a[i]) {
			small=a[i];
		}
	}
	System.out.println("Smallest number is:"+small);
 }
}
