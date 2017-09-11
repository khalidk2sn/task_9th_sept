package classHomeTill_9th;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateValue {
	void find(int arr[], int len) {
		Arrays.sort(arr);
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("duplicate value ="+arr[i]+" at position" +(j));
			}
		}
		
	}

	public static void main(String[] args) {
		
		int A[], n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array :");
		n=in.nextInt();
		A=new int [n];
		System.out.println("Enter Elements of array :");
		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
	DuplicateValue obj= new DuplicateValue();
	obj.find(A,n);
}
}
