package classHomeTill_9th;
import java.util.Scanner;

public class SortNumArray {

	public static void main(String[] args) {
		int a[], temp,n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array:");
		n=in.nextInt();
		a=new int[n];
		System.out.println("enter elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("elements of given array are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		System.out.println("elements of given array after sorting  :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
			
		}
	}

}
