package classHomeTill_9th;
import java.util.Scanner;

public class ReverseElement {
	void display(int a[]) {
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
	void reverse(int a[]) {
		int len=a.length;
		int temp;
		for(int i=0,j=len-1;i<j;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[], n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array :");
		n=in.nextInt();
		arr=new int[n];
		System.out.println("enter elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		ReverseElement obj= new ReverseElement();
		System.out.println("element of array :");
		obj.display(arr);
		obj.reverse(arr);
		System.out.println("\nelement of array  after reversing :");
		obj.display(arr);
	}
		
	
	
}
