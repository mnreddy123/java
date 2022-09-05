package sep_05;
import java.util.Scanner;

public class Insertion 
{
  public static void main(String[] args) 
  {
	int temp,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many numbers are to be printed");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter " +n+ " integers");
	for(int i=0;i<n;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Before sorting:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	
	// To start Function with insertion sort
	System.out.println();
	System.out.println("After sorting");
	for(int i=1;i<a.length;i++)
	{
		temp = a[i];
		 j=i-1;
		
		while(j>=0 && temp<=a[j])
		{
			 a[j+1]=a[j];
			 j = j-1;
		}
		 a[j+1]=temp ;
		
	}
	for (int i = 0; i < a.length; i++)
	{
		System.out.print(a[i]+" ");
		
	}
	
	
  }
}
