package classHomeTill_9th;
import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {

	public static void main(String[] args) {
		String str[],temp;
		int n;
		Scanner in=new Scanner(System.in);
		Scanner ab=new Scanner(System.in);
		System.out.println("enter size of array:");
		n=in.nextInt();
		str=new String[n];
		System.out.println("enter elements of array:");
		for(int i=0;i<n;i++)
		{
			str[i]=ab.nextLine();
		}
		System.out.println("elements of given array are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		System.out.println("Elements of given array after sorting  :");
		for( int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
			

	}

}
