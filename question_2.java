package midJan;
import java.util.Scanner;

public class question_2 {
	
	public static int findPosition(int[] arr,int n)
	{
		int leftSum=0;
		for(int i=0;i<n;i++)
			leftSum+=arr[i];//sum all the elements from 0 to n-1
		int rightSum=0;
		for(int i=n-1;i>=0;i--)
		{
			rightSum+=arr[i];//sum all the elements from n-1 to 0
			leftSum-=arr[i];//subtract the leftSum from n-1 to 0
			if(rightSum>leftSum)
				return -1;
			if(leftSum==rightSum)
				return i;// return the index if leftSum and rightSum are equal;
		}
		return -1;//return -1 if leftSum and rightSum not equal 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size if the array");
		int n=sc.nextInt();//size of an array
		int[] arr=new int[n];
		System.out.println("enter the" +n+" elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();//read all array elements
		int pos=findPosition(arr,n);
		if(pos==-1)
			System.out.println("Not possible");
		else
		{
			for(int i=0;i<n;i++)
			{
				if(i==pos)
					System.out.println();
				System.out.print(arr[i]+" ");
			}
		}
	}
}
