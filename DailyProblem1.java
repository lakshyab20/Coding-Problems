/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/

import java.util.*;

class DailyProblem1
{
		public static void main(String args[])
		{
			int sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of list: ");
			int n= sc.nextInt();
			int list[]=new int[n];
			System.out.println("Enter the elements in the list: ");
			for (int i=0;i<n;i++)
			{
				list[i]=sc.nextInt();
			}
			System.out.println("Enter the value of k: ");
			int k = sc.nextInt();
			for (int i=0;i<(n-1);i++)
			{
				for(int j=0;j<n;j++)
				{
					sum=list[i]+list[j];
					if(sum==k)
					{
						System.out.println("True");
					}
					sum=0;
				}
			}
		}
}