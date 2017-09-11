package classHomeTill_9th;
import java.util.Scanner;
class AddValue{
	 public int sum(int arr[])
	{
		int s=0;
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			s+=arr[i];
		}
		return s;
	}
}
public class ArraySumValue {

	public static void main(String[] args) {

		int A[],n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array :");
		n=in.nextInt();
		A=new int[n];
		System.out.println("Enter elements of array :");
		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
			
		}
		AddValue ob=new AddValue();
		
		int total=ob.sum(A);
		System.out.println("sum of values of array="+total);
		
		
	}

}
