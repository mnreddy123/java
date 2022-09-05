package sep_05;
import java.util.Scanner;
public class Bubble 
{
   public static void main(String[] args) 
   {
	   // user input
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter how many numbers are to be printed");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  System.out.println("enter " + n + " integers");
	  for(int i=0;i<n;i++)
	  {
		  a[i] = sc.nextInt();
	  }
	 //int a[] = {35,10,12,3,60};
	 System.out.println("Before sorting an array:");
	 // function to print array elements
	 for(int i=0; i<a.length; i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	 
	// Function to implement the bubble sort.
	 System.out.println();
	 System.out.println("After sorting an array:");
	 for(int i=0;i<a.length;i++)    
	 {
		for(int j=i+1; j<a.length;j++)
		{
		   if(a[j] < a[i])
		   {
			  int temp = a[i];
			  a[i]=a[j];
			  a[j]=temp;
		   }
		}
		System.out.print(a[i]+" ");
	 }
   }
}
